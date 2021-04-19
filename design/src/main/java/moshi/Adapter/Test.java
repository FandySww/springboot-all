package moshi.Adapter;

/**
 * @Author fandayong
 * @description
 */
public class Test {
    public static void main(String[] args) {
        DC5 dc5 = new Poweradapter(new AC220());
        dc5.outputDC5();
    }
}
