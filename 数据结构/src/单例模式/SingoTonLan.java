package 单例模式;

public class SingoTonLan {
    private static SingoTonLan singoTonLan=null;
    SingoTonLan(){};
    public SingoTonLan getInstance(){
        if(singoTonLan==null){
            synchronized (SingoTonLan.class){
                if(singoTonLan==null){
                    singoTonLan=new SingoTonLan();
                }
            }
        }
        return singoTonLan;
    }
}
