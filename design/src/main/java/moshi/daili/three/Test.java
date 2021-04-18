package moshi.daili.three;

/**
 * @Author fandayong
 * @Date 2021/4/18 1:40 AM
 * @description
 */
public class Test {
    public static void main(String[] args) throws Exception {
        Person obj = (Person)new JDKMeipo().getInstance(new Customer());
        obj.findLove();
        obj.findLove1();
    }
}
