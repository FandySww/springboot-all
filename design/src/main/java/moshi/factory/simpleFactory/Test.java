package moshi.factory.simpleFactory;

/**
 * @Author fandayong
 * @Date 2021/4/17 11:04 PM
 * @description
 */
public class Test {
    public static void main(String[] args) {
        CourseFactory courseFactory = new CourseFactory();
        courseFactory.create(JavaCourse.class).record();
    }
}
