package Multithreading;
import static java.lang.Thread.sleep;

import java.util.Random;
public class Main2  {
    public static void main(String[] args) throws InterruptedException {
        long startTime=System.currentTimeMillis();
        new Thread(new Runnable(){
            @Override
            public void run(){
                for (int i = 0; i < 10; i++) {
                    Random random = new Random();
                    try {
                        sleep(random.nextInt(1000));
                        
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    
                }
            }
        }).start();
        
        long endTime = System.currentTimeMillis();
        System.out.println("Total Time taken by my system is :->  "+(endTime - startTime));
    }
}