package 单例模式复习;

public class 单例3懒汉安全 {
    public 单例3懒汉安全() {
    }
    private static 单例3懒汉安全 d=null;
    public static 单例3懒汉安全 getInstance(){
        if (d==null){
            synchronized (单例3懒汉安全.class){
                if(d==null) d=new 单例3懒汉安全();
            }
        }

        return d;
    }
}
