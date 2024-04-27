package Multithreading;

public class Brackets {
    private Object lock="Lock";
    public void generate() throws InterruptedException{
        synchronized(lock){
        for(int i=1;i<=20;i++){
            if(i <=10){
                System.out.print('[');
            }
            else{
                System.out.print(']');
            }
        }
        System.out.println();
    }
        for(int i=0;i<10;i++){
            Thread.sleep(10);
        }
    }
}
