package moshi.strategy;

/**
 * @Author fandayong
 * @description
 */
public class PromotionActivity {
    private PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }
    public void execute(){
        promotionStrategy.doPromotion();
    }
}
