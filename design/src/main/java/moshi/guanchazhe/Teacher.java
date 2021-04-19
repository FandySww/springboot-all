package moshi.guanchazhe;

import javafx.beans.InvalidationListener;

import java.util.Observable;
import java.util.Observer;


/**
 * @Author fandayong
 * @Date 2021/4/19 2:31 PM
 * @description
 */
public class Teacher implements Observer {
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o,Object arg) {
        GPer gper = (GPer)o;
        Question question = (Question)arg;
        System.out.println("=======================");
        System.out.println(name+"老师您好，您收到了一个来自"+gper.getName()+"的提问"+question.getContent()+"提问者:"+question.getUserName());
    }
}
