package 代理模式复习.Cglib代理;

public class Main {

    public static void main(String[] args) {
//        CglibDaili cglibDaili=new CglibDaili(new Imp("zzq1"));
//        Imp intance = (Imp) cglibDaili.getIntance();
//        intance.say();
//        intance.write();
////        intance.setName("aaa");
//        System.out.println( intance.getName());;
        CglibTest cglibTest=new CglibTest(new Imp("zzq"));
        Imp intance = (Imp)cglibTest.getIntance();
        intance.say("hello");
    }
}
