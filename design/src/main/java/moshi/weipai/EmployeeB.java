package moshi.weipai;

/**
 * @Author fandayong
 * @Date 2021/4/18 2:33 PM
 * @description
 */
public class EmployeeB implements IEmployee{
    @Override
    public void doing(String command) {
        System.out.println("我是员工B，我现在开始干"+command+"工作");
    }
}
