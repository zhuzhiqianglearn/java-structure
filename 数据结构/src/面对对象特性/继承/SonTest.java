package 面对对象特性.继承;

public class SonTest extends FatherTest {

    private String name;

    static {
        System.out.println("--子类的静态代码块--");
    }

    {
        System.out.println("--子类的非静态代码块--");
    }

    SonTest() {
        System.out.println("--子类的无参构造函数--");
    }

    SonTest(String name) {
        this.name = name;
        System.out.println("--子类的有参构造函数--" + this.name);
    }

    @Override
    public void speak() {
        System.out.println("--子类Override了父类的方法--");
    }

    public static void main(String[] args) {
        System.out.println("--子类主程序--");
        FatherTest father = new FatherTest("父亲的名字");
        father.speak();
        SonTest son = new SonTest("儿子的名字");
        son.speak();
//        System.out.println("----------------");
//        son = new SonTest("儿子的名字11111");
    }
}
