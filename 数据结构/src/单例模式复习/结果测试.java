package 单例模式复习;

public class 结果测试 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
//                    System.out.println(单例1.getIntance());
//                    System.out.println(单例2静态代码快.getIntance());
//                    System.out.println(单例3懒汉.getInstance());//不安全的
//                    System.out.println(单例3懒汉安全.getInstance());//安全的
//                    System.out.println(单例4内部静态类.getIntance());
                    for (Singleton枚举 s:Singleton枚举.values()){
                        System.out.println(s.toString());
                        s.setName("111");
                        System.out.println(s.getName());
                    }
                }
            }).start();
        }
    }
}
