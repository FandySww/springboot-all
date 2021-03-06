package com.sentinel.hello;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @Author fandayong
 * @Date 2021/3/30 2:31 PM
 * @description
 */
@Service
public class AsyncService {
    //Async表示方法为异步调用
    @Async
    public void hello(){
        System.out.println("异步调用开始======");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("异步调用结束=====");
    }
}
