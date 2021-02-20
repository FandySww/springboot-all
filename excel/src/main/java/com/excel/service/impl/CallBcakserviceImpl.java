package com.excel.service.impl;

import com.excel.dto.CallbackDto;
import com.excel.service.CallBackService;
import com.excel.utils.DecryptionZipUtils;
import com.excel.utils.DownLoadUtils;
import com.excel.utils.ReadJsonUtils;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Date;

/**
 * @Author fandayong
 * @Date 2021/2/20 5:40 PM
 * @description
 */
@Service
public class CallBcakserviceImpl implements CallBackService {
    public void getDataRomUrl(CallbackDto callbackDto) throws IOException, URISyntaxException {
        // 获得时间戳
        Date date = new Date();
        String tp = String.valueOf(date.getTime());
        String path = DownLoadUtils.class.getClassLoader().getResource("").getPath();
        String fileName = path + tp;
        File file = new File(fileName + ".zip");
        File outFile = new File(fileName + ".json");
        // 调用downloadUel
        DownLoadUtils.getDataRomUrl(callbackDto,file);
        // 解压文件 需要解压密码
        DecryptionZipUtils.unzip(file,callbackDto.getUnzipPassword(),outFile);
        // 读取解压的问价到内存 https://www.cnblogs.com/wkfvawl/p/11876107.html
        String jsonString = ReadJsonUtils.readJsonFile(outFile);
        // 删除压缩问价能和json文件
        file.delete();
        outFile.delete();
        return;
    }
}
