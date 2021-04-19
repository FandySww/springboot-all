package moshi.factory.factoryMethod;

import moshi.factory.simpleFactory.ICourse;
import moshi.factory.simpleFactory.PythonCourse;

/**
 * @Author fandayong
 * @description
 */
public class PythonCourseFactory implements ICourseFactory{
    @Override
    public ICourse create() {
        return new PythonCourse();
    }
}
