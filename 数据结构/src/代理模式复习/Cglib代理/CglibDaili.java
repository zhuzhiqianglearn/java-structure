package 代理模式复习.Cglib代理;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibDaili implements MethodInterceptor {
    private Object imp;

    public CglibDaili(Object imp) {
        this.imp = imp;
    }
    public Object getIntance(){
        Enhancer enhancer=new Enhancer();
        enhancer.setSuperclass(imp.getClass());
        enhancer.setCallback(this);
        Object o = enhancer.create();
        return o;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("CGLIB 代理开始");
        Object returnValue = method.invoke(imp, objects);
        System.out.println("CGLIB 代理结束");
        return returnValue;
    }
}
