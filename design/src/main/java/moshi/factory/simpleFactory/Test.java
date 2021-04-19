package moshi.factory.simpleFactory;

/**
 * @Author fandayong
 * @description
 */
public class Test {
    public static void main(String[] args) {
        CourseFactory courseFactory = new CourseFactory();
        courseFactory.create(JavaCourse.class).record();
    }
}
