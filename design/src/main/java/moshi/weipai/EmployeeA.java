package moshi.weipai;

/**
 * @Author fandayong
 * @Date 2021/4/18 2:30 PM
 * @description
 */
public class EmployeeA implements IEmployee{
    @Override
    public void doing(String command) {
        System.out.println("我是员工A，我现在开始干"+command+"工作");
    }
}
