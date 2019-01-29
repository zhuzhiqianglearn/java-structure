package 工厂模式;

public class Main {
    public static void main(String[] args) {
        IdCardFactory idCardFactory=new IdCardFactory();
        Produce zzq = idCardFactory.create("zzq");
        Produce zzq1 = idCardFactory.create("zzq1");
        Produce zzq2 = idCardFactory.create("zzq2");
        zzq.use();
        zzq1.use();
        zzq2.use();
        System.out.println(idCardFactory.getList().size());
    }
}
