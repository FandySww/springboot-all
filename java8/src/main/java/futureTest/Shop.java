package futureTest;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

/**
 * @Author fandayong
 * @Date 2021/2/25 3:59 PM
 * @description
 */
@Data
@AllArgsConstructor
public class Shop {
    private String shopName;
    Random random = new Random();

    public Shop(String bestShop) {
        this.shopName = bestShop;
    }

    public double getPrice(String product){
        return calculatePrice(product);
    }
    public static void delay() {
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    private double calculatePrice(String product) {
        if("MyFavoriteShop".equals(product)){
            int a = 1/0;
        }
        delay();
        return random.nextDouble() * product.charAt(0) + product.charAt(1);
    }
    public Future<Double> getPriceAsync(String product) {
        CompletableFuture<Double> futurePrice = new CompletableFuture<>();
        new Thread( () -> {
            double price = calculatePrice(product);
            futurePrice.complete(price);
        }).start();
        return futurePrice;
    }
    public Future<Double> getPriceAsync1(String product) {
        return CompletableFuture.supplyAsync(() -> calculatePrice(product));
    }

}
