package Multithreading;

import static java.lang.Thread.sleep;

// import static java.lang.Thread.sleep;
public class Main {
    public static void main(String[] args) throws InterruptedException {
        long startTime=System.currentTimeMillis();
        MyCounter counter1= new MyCounter(1);
        MyCounter counter2= new MyCounter(2);
        MyCounter counter3= new MyCounter(3);
        counter1.start();
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$4");
        counter2.start();
        counter3.start(); // running on there own

        sleep(5500);
        long endTime = System.currentTimeMillis();
        // Previous our time was 10200 ms
        // Now our time was 5513 ms for 3 threads
        System.out.println("Total Time taken by my system is :->  "+(endTime - startTime));
    }
}
class MyCounter extends Thread{
    private int threadNo;

    public MyCounter(int threadNo){
        this.threadNo = threadNo;
    }
    @Override
    public void run(){
        try {
            countMe();
        } catch (InterruptedException e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }
    public void countMe() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            sleep(500);
            System.out.println("Thread no : "+threadNo+" and itreation no: "+i);
        }
    }
}
