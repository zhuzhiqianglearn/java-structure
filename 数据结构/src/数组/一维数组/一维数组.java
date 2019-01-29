package 数组.一维数组;

import org.junit.Test;

public class 一维数组 {

    static String a="111";
    //冒泡排序
    public static void main(String[] args) {
        int[] ints={11,52,2,9,7,6};
        synchronized (a){
            try {
                a.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < ints.length - 1; i++) {
            int min=i;
            for (int j=i+1;j < ints.length ; j++){
                int start=ints[min];
                int now=ints[j];
                if(start>now){
                   min=j;
                }
            }
            if(i!=min){
                int temp = ints[i];
                ints[i] = ints[min];
                ints[min] = temp;
            }
            System.out.print("第"+(i+1)+"轮结果：");
            for (int k = 0; k < ints.length; k++) {
                System.out.print(ints[k]+",");
            }
            System.out.println("");
        }

        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }
    
    @Test
    public void maopao(){
        int[] ints={11,52,2,9,7,6};

        for (int i = ints.length-1; i >0 ; i--) {
            for (int j=i-1; j >=0; j--) {
                int start=ints[i];
                int now=ints[j];
                if(start<now){
                    ints[i]=now;
                    ints[j]=start;
                }
            }
        }

        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }


    @Test
    public void maopao1(){
        int[] arrays={11,52,2,9,7,6};

        for (int i = 0; i < arrays.length - 1; i++) {
            for (int j = 0; j < arrays.length - 1 - i; j++) {
                int start=arrays[j];
                int end=arrays[j+1];
                if(start>end){
                    arrays[j+1]=start;
                    arrays[j]=end;
                }
            }
            System.out.print("第"+i+"轮结果：");
            for (int k = 0; k < arrays.length; k++) {
                System.out.print(arrays[k]+",");
            }
            System.out.println("");
        }

        for (int i = 0; i < arrays.length; i++) {
            System.out.println(arrays[i]);
        }
    }
}
