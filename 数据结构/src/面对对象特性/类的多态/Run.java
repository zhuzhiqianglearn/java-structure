package 面对对象特性.类的多态;

public class Run {
    public static void main(String[] args) {
        Computer computer=new DaYinJi();
        computer.run();
        Computer computer1=new SaoMiaoYi();
        computer1.run();
    }
}
