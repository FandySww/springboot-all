package com.excel.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author fandayong
 * @Date 2021/2/20 12:38 PM
 * @description
 */
@Data
@AllArgsConstructor
public class CallbackDto {
    private String key;
    private String orderNo;
    private String downloadUrl;
    private String downloadUrlExpiredTime;
    private String unzipPassword;
}
