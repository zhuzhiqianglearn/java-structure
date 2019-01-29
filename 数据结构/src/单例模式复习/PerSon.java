package 单例模式复习;

public class PerSon {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        PerSon p=new PerSon();
        p.setName("111");
        PerSon p1=new PerSon();
        p1.setName("111");
        System.out.println(p.equals(p1));

    }
}
