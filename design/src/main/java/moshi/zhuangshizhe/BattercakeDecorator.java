package moshi.zhuangshizhe;

/**
 * @Author fandayong
 * @description 创建一个扩展套餐的抽象装饰着
 */
public abstract class BattercakeDecorator extends Battercake{
    // 静态代理 委派机制
    private Battercake battercake;

    public BattercakeDecorator(Battercake battercake) {
        this.battercake = battercake;
    }

    protected abstract void doSomething();

    @Override
    protected String getMsg(){
        return this.battercake.getMsg();
    }

    @Override
    protected int getPrice(){
        return this.battercake.getPrice();
    }
}
