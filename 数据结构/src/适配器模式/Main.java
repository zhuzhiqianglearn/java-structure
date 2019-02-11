package 适配器模式;

public class Main {
    public static void main(String[] args) {
        Print print=new PrintBanner("hello");
        print.printWeak();
        print.printStrong();
        print.printStrong();
    }
}
