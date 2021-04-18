package moshi.strategy;

/**
 * @Author fandayong
 * @Date 2021/4/18 3:51 PM
 * @description
 */
public class CoupionStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("领取优惠券，获得折扣");
    }
}
