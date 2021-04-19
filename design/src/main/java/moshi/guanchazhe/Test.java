package moshi.guanchazhe;

/**
 * @Author fandayong
 * @Date 2021/4/19 2:36 PM
 * @description
 */
public class Test {
    public static void main(String[] args) {
        GPer gPer = GPer.getInstance();
        Teacher tom = new Teacher("tom");
        Teacher mic = new Teacher("mic");

        gPer.addObserver(tom);
        gPer.addObserver(mic);

        Question q = new Question();
        q.setUserName("小明");
        q.setContent("什么是观察者");

        gPer.publishQuesition(q);
    }
}
