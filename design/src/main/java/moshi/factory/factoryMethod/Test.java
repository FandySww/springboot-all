package moshi.factory.factoryMethod;

/**
 * @Author fandayong
 * @description
 */
public class Test {
    public static void main(String[] args) {
        ICourseFactory factory = new JavCourseFactory();
        factory.create().record();
    }
}
