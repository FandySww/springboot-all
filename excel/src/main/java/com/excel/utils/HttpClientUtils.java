package com.excel.utils;

import java.io.*;
import java.net.URISyntaxException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.excel.dto.CallbackDto;
import org.apache.commons.httpclient.*;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author fandayong
 * @Date 2021/2/20 2:52 PM
 * @description https://www.cnblogs.com/yshyee/p/8623295.html
 */
public class HttpClientUtils {
    public static void getDataRomUrl(CallbackDto callbackDto,HttpServletRequest request) throws IOException, URISyntaxException {
        HttpClient httpClient = new HttpClient();
        GetMethod getMethod = new GetMethod(callbackDto.getDownloadUrl());
        int statusCode = httpClient.executeMethod(getMethod);
        InputStream is = getMethod.getResponseBodyAsStream();
        // 获得时间戳
        Date date = new Date();
        String fileName = String.valueOf(date.getTime());
        String path = HttpClientUtils.class.getClassLoader().getResource("").getPath();
        inputStream2File(is,new File(path + fileName+".zip"));
        getMethod.releaseConnection();
        // 解压文件 需要解压密码
        unzip(fileName,callbackDto);
    }

    // https://blog.csdn.net/Jumping_code/article/details/108217804
    // https://www.jb51.net/article/164137.htm
    //
    public static void unzip(String fileName,CallbackDto callbackDto) {
        String password = callbackDto.getUnzipPassword();

    }

    public static void inputStream2File(InputStream is,File file) {
        OutputStream os = null;
        try {
            os = new FileOutputStream(file);
            int bytesRead = 0;
            byte[] buffer = new byte[8192];
            while ((bytesRead = is.read(buffer,0,8192)) != -1) {
                os.write(buffer,0,bytesRead);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(HttpClientUtils.class.getName()).log(Level.SEVERE,null,ex);
        } catch (IOException ex) {
            Logger.getLogger(HttpClientUtils.class.getName()).log(Level.SEVERE,null,ex);
        } finally {
            try {
                if (null != os) {
                    os.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(HttpClientUtils.class.getName()).log(Level.SEVERE,null,ex);
            } finally {
                if (null != is) {
                    try {
                        is.close();
                    } catch (IOException ex) {
                        Logger.getLogger(HttpClientUtils.class.getName()).log(Level.SEVERE,null,ex);
                    }
                }
            }
        }
    }
}
