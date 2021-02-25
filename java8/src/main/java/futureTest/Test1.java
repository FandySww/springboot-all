package futureTest;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

/**
 * @Author fandayong
 * @Date 2021/2/25 4:23 PM
 * @description
 */
public class Test1 {
    static List<Shop> shops = Arrays.asList(new Shop("BestPrice"),
            new Shop("LetsSaveBig"),
            new Shop("MyFavoriteShop"),
            new Shop("BuyItAll"));
    private static final Executor executor =
            Executors.newFixedThreadPool(Math.min(shops.size(),100),
                    new ThreadFactory() {
                        @Override
                        public Thread newThread(Runnable r) {
                            Thread t = new Thread(r);
                            t.setDaemon(true);
                            return t;
                        }
                    });

    public static void main(String[] args) {
        long start = System.nanoTime();
        System.out.println(findPrices3("myPhone27S"));
        long duration = (System.nanoTime() - start) / 1_000_000;
        System.out.println("Done in " + duration + " msecs");

    }

    public static List<String> findPrices(String product) {
        return shops.parallelStream()
                .map(shop -> String.format("%s price is %.2f",
                        shop.getShopName(),shop.getPrice(product)))
                .collect(toList());
    }

    public static List<String> findPrices1(String product) {
        return shops.stream()
                .map(shop -> String.format("%s price is %.2f",
                        shop.getShopName(),shop.getPrice(product)))
                .collect(toList());
    }

    public static List<String> findPrices2(String product) {
        List<CompletableFuture<String>> priceFutures =
                shops.stream()
                        .map(shop -> CompletableFuture.supplyAsync(
                                () -> shop.getShopName() + " price is " +
                                        shop.getPrice(product)))
                        .collect(Collectors.toList());
        return priceFutures.stream()
                .map(CompletableFuture::join)
                .collect(toList());
    }

    public static List<String> findPrices3(String product) {
        List<CompletableFuture<String>> priceFutures =
                shops.stream()
                        .map(shop -> CompletableFuture.supplyAsync(
                                () -> shop.getShopName() + " price is " +
                                        shop.getPrice(shop.getShopName()), executor))
                        .collect(Collectors.toList());
        return priceFutures.stream()
                .map(CompletableFuture::join)
                .collect(toList());
    }
}
