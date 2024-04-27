package Multithreading;

import static java.lang.Thread.sleep;

public class Problem {
    protected static int counter = 0;

    public static void main(String[] args) throws InterruptedException {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 10000; i++) {
                    Problem.counter++;
                }
                System.out.println("Thread 1 is over");
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 10000; i++) {
                    Problem.counter++;
                }
                System.out.println("Thread 2 is over");

            }
        }).start();
        // sleep(3000);
        System.out.println(counter);
    }
}
