package 代理模式复习.静态代理;

public class Imp implements JieKou {
    @Override
    public void say() {
        System.out.println("静态代理----");
    }

    @Override
    public JieKou getImp() {
        JieKou jieKou=null;
        try {
            jieKou= (JieKou) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return  jieKou;
    }

}
