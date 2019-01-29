package 单例模式;

public class SingoTon {
    private static SingoTon singoTon=null;
    SingoTon(){};
    static{
       singoTon=new SingoTon();
    }
    public SingoTon getInstance(){
        return singoTon;
    }
}
