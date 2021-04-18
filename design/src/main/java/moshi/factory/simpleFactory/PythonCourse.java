package moshi.factory.simpleFactory;

public class PythonCourse implements ICourse{
    @Override
    public void record() {
        System.out.println("录制python课程");
    }
}
