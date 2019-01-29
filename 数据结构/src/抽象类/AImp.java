package 抽象类;

public class AImp extends A {
    @Override
    public String hello() {
        return "hello world";
    }

    public static void main(String[] args) {
        AImp aImp=new AImp();
        aImp.name="111";
        aImp.aaa();
    }
}
