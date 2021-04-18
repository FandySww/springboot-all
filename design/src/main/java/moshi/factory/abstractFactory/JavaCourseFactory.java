package moshi.factory.abstractFactory;

/**
 * @Author fandayong
 * @Date 2021/4/18 12:47 AM
 * @description
 */
public class JavaCourseFactory implements CourseFactory{
    @Override
    public INote createNote() {
        return new JavaNode();
    }

    @Override
    public IVideo createVideo() {
        return new JavaVideo();
    }
}
