package com.excel.controller;

import com.excel.common.RiskResult;
import com.excel.dto.CallbackDto;
import com.excel.utils.HttpClientUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.net.URISyntaxException;

/**
 * @Author fandayong
 * @Date 2021/2/20 12:03 PM
 * @description
 */
@RestController
@RequestMapping(value="/data/callback")
public class CallBack {
    @GetMapping("/accept")
    public RiskResult testNatapp(HttpServletRequest request) throws IOException, URISyntaxException {
        CallbackDto callbackDto = new CallbackDto(
                request.getParameter("key"),request.getParameter("orderNo"),
                request.getParameter("downloadUrl"),request.getParameter("downloadUrlExpiredTime"),
                request.getParameter("unzipPassword")
        );
        // 调用downloadUel
        HttpClientUtils.getDataRomUrl(callbackDto,request);
        return RiskResult.success();
    }
}
