package moshi.strategy;

/**
 * @Author fandayong
 * @Date 2021/4/18 4:01 PM
 * @description
 */
public class CashbackStragegy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("返现促销，获得折扣");
    }
}
