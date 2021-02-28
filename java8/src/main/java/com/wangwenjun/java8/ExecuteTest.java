package com.wangwenjun.java8;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuteTest {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2, r -> {
                       Thread t = new Thread();
                       t.setDaemon(true);
                       return t;
                }
        );
        executorService.execute(() -> System.out.println("123"));
        System.out.println("end");
    }
}
