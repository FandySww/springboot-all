package moshi.strategy;

/**
 * @Author fandayong
 * @description
 */
public class GroupbuyStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("拼团，获得折扣");
    }
}
