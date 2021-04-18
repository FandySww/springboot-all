package moshi.factory.abstractFactory;

/**
 * @Author fandayong
 * @Date 2021/4/17 11:48 PM
 * @description
 */
public interface CourseFactory {
    INote createNote();
    IVideo createVideo();
}
