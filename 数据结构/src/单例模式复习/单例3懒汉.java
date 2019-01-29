package 单例模式复习;

public class 单例3懒汉 {
    public 单例3懒汉() {
    }
    private static 单例3懒汉 d=null;
    public static 单例3懒汉 getInstance(){
        if(d==null) d=new 单例3懒汉();
        return d;
    }
}
