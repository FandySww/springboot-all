package moshi.Adapter;

/**
 * @Author fandayong
 * @Date 2021/4/18 9:11 PM
 * @description
 */
public class Test {
    public static void main(String[] args) {
        DC5 dc5 = new Poweradapter(new AC220());
        dc5.outputDC5();
    }
}
