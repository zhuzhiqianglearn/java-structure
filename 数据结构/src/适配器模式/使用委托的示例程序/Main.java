package 适配器模式.使用委托的示例程序;

public class Main {
    public static void main(String[] args) {
        Print printBranner=new PrintBranner("hello");
        printBranner.printWeak();
        printBranner.printStrong();
    }
}
