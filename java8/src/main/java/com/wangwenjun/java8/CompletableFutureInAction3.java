package com.wangwenjun.java8;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.util.stream.Collectors.toList;

/***************************************
 * @author:Alex Wang
 * @Date:2016/11/13 QQ:532500648
 * QQ交流群:286081824
 ***************************************/
public class CompletableFutureInAction3 {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(20, r -> {
            Thread t = new Thread(r);
            t.setDaemon(false);
            return t;
        });

       /* CompletableFuture.supplyAsync(CompletableFutureInAction1::get, executor)
                 // 参数是上一步获得的
                .thenApply(CompletableFutureInAction3::multiply)
                .whenComplete((v, t) -> Optional.ofNullable(v).ifPresent(System.out::println));*/
        Date currentTime = new Date();
        Long currentTimeLong = currentTime.getTime();
        List<Integer> productionIDs = Arrays.asList(1, 2, 3, 4, 5);
        List<Double> result = productionIDs
                .stream()
                .map(i -> CompletableFuture.supplyAsync(() -> queryProduction(i), executor))
                // 当一个线程依赖另一个线程时，可以使用 thenApply 方法来把这两个线程串行化。
                .map(future -> future.thenApply(CompletableFutureInAction3::multiply))
                .map(CompletableFuture::join).collect(toList());
        Date currentTimeEnd = new Date();
        Long currentTimeEndLong = currentTimeEnd.getTime();
        System.out.println(currentTimeEndLong-currentTimeLong);
        System.out.println(result);
    }

    private static double multiply(double value) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return value * 100d;
    }

    private static double queryProduction(int i) {
        return CompletableFutureInAction1.get();
    }
}
