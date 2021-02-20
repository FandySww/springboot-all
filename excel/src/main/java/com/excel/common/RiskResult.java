package com.excel.common;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author fandayong
 * @Date 2021/2/20 12:23 PM
 * @description
 */
@Data
@AllArgsConstructor
public class RiskResult {
    private Integer status;
    private String message;

    public static RiskResult success() {
        RiskResult responseResult = new RiskResult(200,"success");
        return responseResult;
    }
}
