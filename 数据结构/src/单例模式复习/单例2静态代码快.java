package 单例模式复习;

public class 单例2静态代码快 {
    public 单例2静态代码快() {
    }
    private static 单例2静态代码快 d=null;
    static {
        d=new 单例2静态代码快();
    }
    public static 单例2静态代码快 getIntance(){
        return  d;
    }
}
