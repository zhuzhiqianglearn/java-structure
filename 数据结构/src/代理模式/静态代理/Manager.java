package 代理模式.静态代理;

import java.util.HashMap;

public class Manager {
    private HashMap showcase=new HashMap();
    public void register(String name,Product product){
        showcase.put(name,product);
    }
    public Product create(String product){
        Product p= (Product) showcase.get(product);
        return  p.createClone();
    }
}
