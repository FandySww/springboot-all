package moshi.factory.factoryMethod;

import moshi.factory.simpleFactory.ICourse;
import moshi.factory.simpleFactory.JavaCourse;

/**
 * @Author fandayong
 * @Date 2021/4/17 11:14 PM
 * @description
 */
public class JavCourseFactory implements ICourseFactory {
    @Override
    public ICourse create(){
        return new JavaCourse();
    }
}
