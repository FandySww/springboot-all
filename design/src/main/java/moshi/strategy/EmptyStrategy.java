package moshi.strategy;

/**
 * @Author fandayong
 * @Date 2021/4/18 4:03 PM
 * @description
 */
public class EmptyStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("无促销返现促销，不能获得折扣");
    }
}
