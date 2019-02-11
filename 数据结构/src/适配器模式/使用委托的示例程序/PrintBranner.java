package 适配器模式.使用委托的示例程序;

public class PrintBranner implements Print{
    private Banner banner;

    public PrintBranner(String string) {
        banner=new Banner(string);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
         banner.showWithAster();
    }
}
