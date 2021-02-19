package com.excel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

/**
 * @AUTHOR lgp
 * @DATE 2018/7/31 15:25
 * @DESCRIPTION
 **/
@Controller
public class HiController {
    @RequestMapping("/index")
    public String index(Map<String, Object> map) {
        return "/index";
    }
}
