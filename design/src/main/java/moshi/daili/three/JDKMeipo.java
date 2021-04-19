package moshi.daili.three;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author fandayong
 * @description
 */
public class JDKMeipo implements InvocationHandler {
    // 被代理的对象
    private Object target;
    public Object getInstance(Object target) throws Exception{
        this.target = target;
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }
    @Override
    public Object invoke(Object proxy,Method method,Object[] args) throws Throwable {
        before();
        Object obj = method.invoke(this.target,args);
        after();
        return obj;
    }
    private void before(){
        System.out.println("我是媒婆：我要给你介绍个对象");
        System.out.println("开始物色");
    }
    private void after(){
        System.out.println("如果合适的话，就准备把办事");
    }
}
