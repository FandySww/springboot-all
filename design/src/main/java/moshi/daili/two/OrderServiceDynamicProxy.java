package moshi.daili.two;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author fandayong
 * @Date 2021/4/18 1:01 PM
 * @description 只要实现createTime方法  就可以了  不管是order类还是什么都可以装样子
 */
public class OrderServiceDynamicProxy implements InvocationHandler {
    private SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
    private Object target;
    @Override
    public Object invoke(Object proxy,Method method,Object[] args) throws Throwable {
        before(args[0]);
        Object object = method.invoke(target,args);
        after();
        return object;
    }
    public void before(Object target){
        System.out.println("Proxy before method.");
        Long time = null;
        try {
            time = (Long)target.getClass().getMethod("getCreateTime").invoke(target);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        Integer dbRouter = Integer.valueOf(yearFormat.format(new Date(time)));
        System.out.println("动态代理类自动分配到【DB"+dbRouter+"】数据源处理数据");
        DynamicDataSourceEntry.set(dbRouter);
    }
    private void after(){
        System.out.println("Proxy after method.");
    }
}
