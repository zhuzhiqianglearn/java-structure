package 代理模式复习.动态代理;

public class Imp implements JieKou {
    @Override
    public void say() {
        System.out.println("动态代理----");
    }

    @Override
    public void write() {
        System.out.println("动态代理----写");
    }


}
