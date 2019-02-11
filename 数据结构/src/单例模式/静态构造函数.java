package 单例模式;

public class 静态构造函数 {
    private 静态构造函数() {
        System.out.println("这是一个静态构造函数的类");
    }
    public 静态构造函数 getIntance(){
        return  new 静态构造函数();
    }

    public static void main(String[] args) {
        静态构造函数 j=new 静态构造函数();
    }
}
