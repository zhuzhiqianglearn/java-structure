package 单例模式;

public class SingoTon静态变量 {
    final static SingoTon静态变量 singoTon=new SingoTon静态变量();
    SingoTon静态变量(){};
    public SingoTon静态变量 getInstance(){
        return singoTon;
    }
}
