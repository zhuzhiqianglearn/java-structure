package 面对对象特性.page2;

import 面对对象特性.page1.Class1;

public class 三个内置关键词 {
    public static void main(String[] args) {

        Class1 class1=new Class1();
        //这里出现红色提醒，说明不可以直接操作private 参数，如果在一个类下是可以的
//        class1.age=10;
        //这里出现红色提醒，说明不可以直接操作protected 参数，如果在一个类下或者在一个包下是可以的，参考page1下的这个类
//        class1.sex="man";
        class1.hello();
    }
}
