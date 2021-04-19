package moshi.strategy;

/**
 * @Author fandayong
 * @description
 */
public class CoupionStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("领取优惠券，获得折扣");
    }
}
