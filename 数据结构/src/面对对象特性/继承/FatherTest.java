package 面对对象特性.继承;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import java.util.ArrayList;

public class FatherTest {
    private String name;
    FatherTest(){
        System.out.println("--父类的无参构造函数--");
    }
    FatherTest(String name){
        this.name=name;
        System.out.println("--父类的有参构造函数--"+this.name);
    }
    static{
        System.out.println("--父类的静态代码块--");
    }
    {
        System.out.println("--父类的非静态代码块--");
    }

    public void speak(){

        System.out.println("--父类的方法--");

    }

    public static void main(String[] args) {

        System.out.println("--父类主程序--");

        FatherTest father=new FatherTest("父亲的名字");
        father.speak();
        father=new FatherTest("父亲的名字1");
        ArrayList arrayList=new ArrayList();
        arrayList.remove(null);


}


}
