package 代理模式.静态代理;

public class Main {
    public static void main(String[] args) {
        Manager manager=new Manager();
        UnderlinePen upne=new UnderlinePen('~');
        MessageBox mbox=new MessageBox('*');
        MessageBox sbox=new MessageBox('/');
        manager.register("stronge message",upne);
        manager.register("warring box",mbox);
        manager.register("slash box",sbox);

        Product product1=manager.create("stronge message");
        product1.use("hello,world.");
        Product product2=manager.create("warring box");
        product2.use("hello,world.");
        Product product3=manager.create("slash box");
        product3.use("hello,world.");
    }
}
