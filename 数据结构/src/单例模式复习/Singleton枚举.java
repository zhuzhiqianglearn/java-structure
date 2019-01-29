package 单例模式复习;

public enum  Singleton枚举 {
    INSTANCE("1","11"),INSTANCE2("2","22"),INSTANCE3("3","33");

    Singleton枚举(String name, String name1) {
        this.name = name;
        this.name1 = name1;
    }

    private String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    private String name1;

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public static void main(String[] args) {
        int x=0;
        for (Singleton枚举 s:Singleton枚举.values()){
          s.setName("67687");
        }
        for (Singleton枚举 s:Singleton枚举.values()){
            System.out.println(s.name());
            System.out.println(s.ordinal());
            System.out.println(s.toString());
            System.out.println(s.getName()+"---"+s.getName1());
            System.out.println(s.getDeclaringClass());
            System.out.println(s.compareTo(Singleton枚举.INSTANCE2));
            System.out.println("------------------");
        }
    }
}
