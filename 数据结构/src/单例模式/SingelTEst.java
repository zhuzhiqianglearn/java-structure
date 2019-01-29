package 单例模式;

public class SingelTEst {
    public static void main(String[] args) {
//        SingoTon singoTon=new SingoTon().getInstance();
//        SingoTon singoTon1=new SingoTon().getInstance();
//        System.out.println(singoTon);
//        System.out.println(singoTon1);
//        System.out.println("------------");
        for (int i = 0; i < 5; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
//                    System.out.println(new SingoTon().getInstance()); 饿汉式
//                    System.out.println(new SingoTonLan().getInstance()); 双重检查
//                    System.out.println(new SingoTon静态变量().getInstance());
                    System.out.println(new SingoTon静态内部类().getInstance());
                }
            }).start();
        }
    }
}
