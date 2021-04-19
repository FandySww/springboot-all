package moshi.factory.abstractFactory;

/**
 * @Author fandayong
 * @description
 */
public class JavaNode implements INote{
    @Override
    public void edit() {
        System.out.println("编写java笔记");
    }
}
