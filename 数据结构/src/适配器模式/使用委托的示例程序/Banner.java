package 适配器模式.使用委托的示例程序;

//实际情况 交流100伏特
public class Banner {
    private  String string;

    public Banner(String string) {
        this.string = string;
    }
    public void  showWithParen(){
        System.out.println("("+string+")");
    }
    public void  showWithAster(){
        System.out.println("*"+string+"*");
    }
}
