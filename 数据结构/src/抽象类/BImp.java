package 抽象类;

public class BImp implements B {
    @Override
    public void aaa() {
        System.out.println(abcd);
    }

    public static void main(String[] args) {
        BImp bImp=new BImp();
        bImp.aaa();
    }
}
