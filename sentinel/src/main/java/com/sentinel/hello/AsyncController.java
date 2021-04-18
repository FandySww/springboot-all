package com.sentinel.hello;

import com.alibaba.csp.sentinel.AsyncEntry;
import com.alibaba.csp.sentinel.SphU;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author fandayong
 * @Date 2021/3/30 2:32 PM
 * @description
 */
@RestController
public class AsyncController {
    @Autowired
    private AsyncService asyncService;

    @GetMapping("/async")
    public String async(){
        //1.进行限流控制
        AsyncEntry asyncEntry = null;
        try {
            asyncEntry = SphU.asyncEntry("Sentinel_Async"); //限流入口
            asyncService.hello(); //异步调用方法
            System.out.println("异步测试");
        } catch (BlockException e) {
            e.printStackTrace();
            System.out.println("系统繁忙请稍后再试");
        } finally {
            if (asyncEntry != null){
                asyncEntry.exit(); //限流出口
            }
        }
        return "123";
    }

}
