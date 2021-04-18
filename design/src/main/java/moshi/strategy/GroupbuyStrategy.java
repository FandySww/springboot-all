package moshi.strategy;

/**
 * @Author fandayong
 * @Date 2021/4/18 4:02 PM
 * @description
 */
public class GroupbuyStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("拼团，获得折扣");
    }
}
