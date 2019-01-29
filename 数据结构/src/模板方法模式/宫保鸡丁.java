package 模板方法模式;

public class 宫保鸡丁 extends MoBan {
    @Override
    void cai() {
        System.out.println("放入鸡丁，花生米，黄瓜，胡萝卜");
    }

    @Override
    void tiaoliao() {
        System.out.println("放入鸡丁，炒菜的调料");

    }
}
