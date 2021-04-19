package moshi.weipai;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author fandayong
 * @description
 */
public class Leader implements IEmployee{
    private Map<String,IEmployee> targets = new HashMap<String,IEmployee>();
    @Override
    public void doing(String command) {
        targets.get(command).doing(command);
    }
    public Leader(){
        targets.put("加密",new EmployeeA());
        targets.put("登录",new EmployeeB());
    }
}
