package 工厂模式;

public class IdCard extends Produce {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IdCard(String name) {
        System.out.println("制作了  "+name+" 的ID卡");
        this.name = name;
    }

    @Override
    public void use() {
        System.out.println("使用了 "+name+"   的ID卡");
    }
}
