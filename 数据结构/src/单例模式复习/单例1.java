package 单例模式复习;

public class 单例1 {
    public 单例1() {
    }
    private static final 单例1 d=new 单例1();
    public static  单例1 getIntance(){
        return d;
    }
}
