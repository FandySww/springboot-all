package moshi.factory.factoryMethod;

import moshi.factory.simpleFactory.ICourse;
import moshi.factory.simpleFactory.JavaCourse;

/**
 * @Author fandayong
 * @description
 */
public class JavCourseFactory implements ICourseFactory {
    @Override
    public ICourse create(){
        return new JavaCourse();
    }
}
