package 单例模式;

public class SingoTon静态内部类 {
    SingoTon静态内部类(){};
    private static class A{
        final static SingoTon静态内部类 singoTon=new SingoTon静态内部类();

    }
    public SingoTon静态内部类 getInstance(){
        return A.singoTon;
    }
}
