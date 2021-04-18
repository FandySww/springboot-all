package com.sentinel.hello;

import com.alibaba.csp.sentinel.SphO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author fandayong
 * @Date 2021/3/30 2:25 PM
 * @description
 */
@RestController
public class TestControllerBoolean {
    @GetMapping("/boolean")
    public boolean returnBoolean(){
        if (SphO.entry("Sentinel-boolean")){
            try {
                System.out.println("Hello Sentinel");
                return true;
            }finally {
                SphO.exit();//限流的出口
            }
        }else {
            //限流后进行的操作
            System.out.println("系统繁忙,请稍后再试");
            return false;
        }
    }

}
