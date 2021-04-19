package moshi.strategy;

/**
 * @Author fandayong
 * @description
 */
public class CashbackStragegy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("返现促销，获得折扣");
    }
}
