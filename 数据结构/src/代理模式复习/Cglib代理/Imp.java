package 代理模式复习.Cglib代理;

public class Imp {
    private String name;
    public Imp(){

    }
    public Imp(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void say() {
        System.out.println("cglib代理----");
    }


    public void write() {
        System.out.println("cglib代理----写");
    }


}
