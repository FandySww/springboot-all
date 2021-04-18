package moshi.factory.factoryMethod;

/**
 * @Author fandayong
 * @Date 2021/4/17 11:16 PM
 * @description
 */
public class Test {
    public static void main(String[] args) {
        ICourseFactory factory = new JavCourseFactory();
        factory.create().record();
    }
}
