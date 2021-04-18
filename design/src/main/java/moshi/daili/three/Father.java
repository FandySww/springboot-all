package moshi.daili.three;

/**
 * @Author fandayong
 * @Date 2021/4/18 1:38 AM
 * @description
 */
public class Father {
    private Son son;

    public Father(Son son) {
        this.son = son;
    }

    public void findLove(){
        System.out.println("父亲找");
        this.son.findLove();
        System.out.println("可以");
    }
}
