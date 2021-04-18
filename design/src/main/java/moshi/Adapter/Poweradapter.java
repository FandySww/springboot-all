package moshi.Adapter;

/**
 * @Author fandayong
 * @Date 2021/4/18 6:12 PM
 * @description
 */
public class Poweradapter implements DC5{
    private AC220 ac220;

    public Poweradapter(AC220 ac220) {
        this.ac220 = ac220;
    }

    @Override
    public int outputDC5(){
        int adapterInput = ac220.outputAC220V();
        int adapterOutput = adapterInput/44;
        System.out.println("使用PowerAdapter输入AC："+adapterInput+"V"+"输出"+adapterOutput+"V");
        return adapterOutput;
    }
}
