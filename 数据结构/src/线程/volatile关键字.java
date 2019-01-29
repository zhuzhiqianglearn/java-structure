package 线程;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class volatile关键字 {
    public int x=0;
    public volatile  int y=0;
    public String name;



    public static void main(String[] args) throws InterruptedException {
       final volatile关键字 volatile关键字1=new volatile关键字();
        ExecutorService exec = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            exec.execute(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 100000; j++) {
                        volatile关键字1.y=volatile关键字1.y+1;
                    }
                }
            });
        }
        exec.shutdown();
        while (true){
            if(exec.isTerminated()){
                break;
            }
        }
        Thread.sleep(1000);
        System.out.println(volatile关键字1.y);
    }
}
