package Multithreading;

import static java.lang.Thread.sleep;

public class Synchronized {
    public static void main(String arg[]) throws InterruptedException{
        long startTime = System.currentTimeMillis();
        Brackets brackets = new Brackets();
        new Thread(new Runnable(){
            @Override
            public void run(){
                long startTime = System.currentTimeMillis();
                for(int i=0;i<5;i++){
                    try {
                        brackets.generate();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                long endTime = System.currentTimeMillis();
                System.out.println("TOTAL TIME -> "+(endTime- startTime));
            }
        }).start();
       
        new Thread(new Runnable(){
            @Override
            public void run(){
                long startTime = System.currentTimeMillis();
                for(int i=0;i<5;i++){
                    try {
                        brackets.generate();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                long endTime = System.currentTimeMillis();
                System.out.println("TOTAL TIME -> "+(endTime- startTime));
            }
        }).start();
       
        long endTime = System.currentTimeMillis();
        sleep(2000);
        // System.out.println("Total Time taken by my system is :->  "+(endTime - startTime));
    }
}
// 883
// 1470
// 1470 - 883

// without synchron..
// 785 ms

// with sync + pattern got it
// 784