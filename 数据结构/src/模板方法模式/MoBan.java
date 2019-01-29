package 模板方法模式;

public abstract class MoBan {
    public void zuocai() {
        daoyou();
        reyou();
        cai();
        tiaoliao();
        fanchao();
    }

    public void daoyou() {
        System.out.println("倒入油");
    }

    public void reyou() {
        System.out.println("等待油热");
    }

    abstract void cai();

    abstract void tiaoliao();

    public void fanchao() {
        System.out.println("翻炒，上桌");
    }
}
