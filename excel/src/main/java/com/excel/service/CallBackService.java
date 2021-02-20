package com.excel.service;

import com.excel.dto.CallbackDto;

import java.io.IOException;
import java.net.URISyntaxException;

/**
 * @Author fandayong
 * @Date 2021/2/20 5:40 PM
 * @description
 */
public interface CallBackService {
    public void getDataRomUrl(CallbackDto callbackDto) throws IOException, URISyntaxException;
}
