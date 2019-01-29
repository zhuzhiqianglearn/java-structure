package 代理模式复习.动态代理;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Daili {
    private JieKou jieKou;

    public Daili(JieKou jieKou) {
        this.jieKou = jieKou;
    }

    public JieKou getIntance(){
        return (JieKou) Proxy.newProxyInstance(
                jieKou.getClass().getClassLoader(),
                jieKou.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("代理开始");
                        Object returnValue = method.invoke(jieKou, args);
                        System.out.println("代理结束");
                        return returnValue;
                    }
                }
        );
    }
}
