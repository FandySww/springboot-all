package moshi.factory.abstractFactory;

/**
 * @Author fandayong
 * @Date 2021/4/18 12:46 AM
 * @description
 */
public class JavaNode implements INote{
    @Override
    public void edit() {
        System.out.println("编写java笔记");
    }
}
