package moshi.factory.abstractFactory;

/**
 * @Author fandayong
 * @description
 */
public interface CourseFactory {
    INote createNote();
    IVideo createVideo();
}
