package moshi.factory.abstractFactory;

/**
 * @Author fandayong
 * @Date 2021/4/18 12:40 AM
 * @description
 */
public class JavaVideo implements IVideo{

    @Override
    public void record() {
       System.out.println("录制java视频");
    }
}
