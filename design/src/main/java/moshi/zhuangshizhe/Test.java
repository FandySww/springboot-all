package moshi.zhuangshizhe;

/**
 * @Author fandayong
 * @description
 */
public class Test {
    public static void main(String[] args) {
        Battercake battercake;
        battercake = new BaseBattercake();
        battercake = new EggDecorator(battercake);
        battercake = new EggDecorator(battercake);
        battercake = new SausageDecorator(battercake);
        System.out.print(battercake.getMsg()+"---"+battercake.getPrice());
    }
}
