package moshi.zhuangshizhe;

/**
 * @Author fandayong
 * @description
 */
public class BaseBattercake extends Battercake {
    @Override
    protected String getMsg() {
        return "基本套餐煎饼";
    }

    @Override
    protected int getPrice() {
        return 5;
    }
}
