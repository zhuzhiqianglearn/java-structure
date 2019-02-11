package 适配器模式.修改项目的redis的Util;

public class main {
    public static void main(String[] args) {
//      JedisPoolMyC.ONLINE.set("h1","123","xianshang");
//      JedisPoolMyC.BENDI.set("h1","1234","bendi");
//
//        System.out.println(JedisPoolMyC.ONLINE.get("h1"));
//        System.out.println(JedisPoolMyC.BENDI.get("h1"));
//        JedisPoolMy.set("h1","h1","online");
//        JedisPoolMy.set("h1","h12","online2");
//        for (int i = 0; i < 10; i++) {
//            new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    JedisPoolMy.get("h1","online2");
//                    JedisPoolMy.get("h1","online");
//                }
//            }).start();
//        }
//        for (int i = 0; i < 1000; i++) {
//            int finalI = i;
//            new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    if(finalI %2==0){
//                       JedisPoolMyC.ONLINE.set("h"+finalI,finalI+"----------"+Thread.currentThread().getName()+"-----online",finalI+"----------"+Thread.currentThread().getName()+"-----online");
//
//                    }
//                    else if(finalI %2==1){
//                        JedisPoolMyC.BENDI.set("h"+finalI,finalI+"----------"+Thread.currentThread().getName()+"-----bendi",finalI+"-----"+Thread.currentThread().getName()+"-------bendi");
//
//                    }
//                }
//            }).start();
//        }
        JedisPoolMyC.BENDI.set("h"+1,1+"----------"+Thread.currentThread().getName()+"-----online",1+"----------"+Thread.currentThread().getName()+"-----online");

    }
}
