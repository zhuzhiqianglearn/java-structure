package 代理模式;

public class MessageBox implements Product {
    private  char deconchar;

    public MessageBox(char deconchar) {
        this.deconchar = deconchar;
    }

    @Override
    public void use(String s) {
        int lenght=s.getBytes().length;
        for (int i = 0; i < lenght + 4; i++) {
            System.out.print(deconchar);
        }
        System.out.println("");
        System.out.println(deconchar+" "+s+" "+deconchar);
        for (int i = 0; i < lenght + 4; i++) {
            System.out.print(deconchar);
        }
        System.out.println("");
    }

    @Override
    public Product createClone() {
        Product product=null;
        try{
            product= (Product) clone();
        }catch (Exception e){
            e.printStackTrace();
        }
        return product;
    }
}
