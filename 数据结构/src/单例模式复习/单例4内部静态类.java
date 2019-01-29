package 单例模式复习;

public class 单例4内部静态类 {
    public 单例4内部静态类() {
    }
    static class D{
        private static  单例4内部静态类 d=new 单例4内部静态类();
    }
    public static 单例4内部静态类 getIntance(){
        return D.d;
    }
}
