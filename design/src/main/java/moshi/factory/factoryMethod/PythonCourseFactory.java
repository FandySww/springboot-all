package moshi.factory.factoryMethod;

import moshi.factory.simpleFactory.ICourse;
import moshi.factory.simpleFactory.PythonCourse;

/**
 * @Author fandayong
 * @Date 2021/4/17 11:16 PM
 * @description
 */
public class PythonCourseFactory implements ICourseFactory{
    @Override
    public ICourse create() {
        return new PythonCourse();
    }
}
