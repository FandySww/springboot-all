package moshi.strategy;

/**
 * @Author fandayong
 * @description
 */
public class EmptyStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("无促销返现促销，不能获得折扣");
    }
}
