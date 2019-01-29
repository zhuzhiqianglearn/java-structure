package 工厂模式;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class IdCardFactory extends FactoryM {
    private List list=new ArrayList();
    @Override
    protected Produce createProduce(String ower) {
        return new IdCard(ower);
    }

    @Override
    protected void regiterProduce(Produce p) {
        list.add(((IdCard)p).getName());
        System.out.println(((IdCard)p).getName()+"  注册了IDCard");
    }

    public List getList() {
        return list;
    }
     @Test
     public void aaaa(){
        double x=300000;
        double y=0.03;
         for (int i = 0; i < 30; i++) {
             if(i<15){
                 x=x+x*y+50000;
             }
             else{
                 x=x+x*y;
             }
             System.out.println(x);
         }

     }

}
