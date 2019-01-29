package 代理模式.静态代理;

public class UnderlinePen implements Product {
    private char ulchar;

    public UnderlinePen(char ulchar) {
        this.ulchar = ulchar;
    }

    @Override
    public void use(String s) {
        int lenght=s.getBytes().length;
        System.out.println("\""+s+"\"");
        System.out.print(" ");
        for (int i = 0; i <lenght; i++) {
            System.out.print(ulchar);
        }
        System.out.println(" ");
    }

    @Override
    public Product createClone() {
        Product product=null;
        try {
            product= (Product) clone();
        }catch (Exception e){
            e.printStackTrace();
        }
        return product;
    }
}
