package 代理模式复习.动态代理;

public class Main {
    public static void main(String[] args) {
        Imp imp=new Imp();
        Daili daili=new Daili(imp);
        JieKou intance = daili.getIntance();
        intance.say();
        intance.write();
    }
}
