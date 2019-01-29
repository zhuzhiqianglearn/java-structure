package 代理模式复习.静态代理;

public class Daili  {
    private JieKou jieKou;

    public Daili(JieKou jieKou) {
        this.jieKou = jieKou;
    }
    public JieKou creatClone(){
        JieKou jie=jieKou.getImp();
        return jie;

    }
}
