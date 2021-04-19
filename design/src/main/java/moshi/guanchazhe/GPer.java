package moshi.guanchazhe;

import java.util.Observable;

/**
 * @Author fandayong
 * @Date 2021/4/19 2:14 PM
 * @description
 */
public class GPer extends Observable {
    private String name = "GPer生态圈";
    private static volatile GPer gper = null;
    private GPer(){}
    public static  GPer getInstance(){
        if(gper==null){
            synchronized (GPer.class){
                if(gper==null){
                    return new GPer();
                }
            }
        }
        return gper;
    }
    public String getName(){
        return name;
    }
    public void publishQuesition(Question question){
       System.out.println(question.getUserName()+"在"+this.name+"上提交了问题");
       setChanged();
       notifyObservers(question);
    }
}
