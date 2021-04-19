package moshi.daili.three;

/**
 * @Author fandayong
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
