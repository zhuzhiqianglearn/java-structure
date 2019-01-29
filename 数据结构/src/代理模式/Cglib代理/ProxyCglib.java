package 代理模式.Cglib代理;

import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class ProxyCglib implements MethodInterceptor {
    private Object target;

    public ProxyCglib(Object target) {
        this.target = target;
    }
    public Object  getInstance(){
        //1.工具类
        Enhancer en=new Enhancer();
        //2.设置父类
        en.setSuperclass(target.getClass());
        //3.设置回调函数
        en.setCallback(this);
        //4.创建子类(代理对象)
        return en.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("开启事务");
        Object invoke = method.invoke(target, objects);
        System.out.println("提交事务");
        return invoke;
    }
}
