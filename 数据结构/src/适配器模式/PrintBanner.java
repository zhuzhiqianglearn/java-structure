package 适配器模式;

//适配器
public class PrintBanner extends Banner implements Print {
    public PrintBanner(String string) {
        super(string);
    }

    @Override
    public void printWeak() {
        showWithParen();
        }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
