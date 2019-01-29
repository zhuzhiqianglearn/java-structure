package 代理模式.clone复制;

public class CloneTest implements Cloneable {
    private String name;
    private String age;
    private int[] aaa=new int[2];

    public int[] getAaa() {
        return aaa;
    }

    public void setAaa(int[] aaa) {
        this.aaa = aaa;
    }

    public CloneTest(String name, String age) {
        this.name = name;
        this.age = age;
        aaa[0]=1;
        aaa[1]=2;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CloneTest{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    @Override
    protected CloneTest clone() throws CloneNotSupportedException {
        CloneTest cloneTest=null;
        try {
            cloneTest= (CloneTest) super.clone();
            cloneTest.setAaa(new CloneTest(cloneTest.getName(),cloneTest.getAge()).getAaa());
        }catch (Exception e){
            e.printStackTrace();
        }

        return cloneTest;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        CloneTest cloneTest=new CloneTest("zzq","18");
        CloneTest cloneTest1=cloneTest;
        CloneTest clone = (CloneTest)cloneTest.clone();
        cloneTest.setName("zzq1");
        clone.setName("zzq2");
        System.out.println(cloneTest.toString());
        System.out.println(cloneTest1.toString());
        System.out.println(clone.toString());
        System.out.println("---------------------");
        System.out.println(cloneTest.aaa[0]);
        cloneTest1.aaa[0]=2;
        System.out.println(cloneTest1.aaa[0]);
        System.out.println(clone.aaa[0]);
    }
}
