package moshi.mobanfangfa;

/**
 * @Author fandayong
 * @description
 */
public class BigDataCourse extends NetworkCourse{
    private boolean needHomeWorkFlag = false;

    public BigDataCourse(boolean needHomeWorkFlag) {
        this.needHomeWorkFlag = needHomeWorkFlag;
    }
    @Override
    void checkHomework() {
        System.out.println("检查大数据架构课程");
    }
    @Override
    protected boolean needHomework(){
        return needHomeWorkFlag;
    }
}
