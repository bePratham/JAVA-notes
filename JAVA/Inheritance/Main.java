package Inheritance;

public class Main {
    public static void main(String[] args) {
        Box b1= new Box(1.2,3.2,2.3);
        BoxWeight bx1=new BoxWeight(2.3,4.2,1.3,51);
        // // BoxWeight b2=new BoxWeight();
        // System.out.println(b1.b);
        // // System.out.println(b1.l);
        // // System.out.println(b1.h);
        // BoxVolume bv=new BoxVolume(2.3,1,2.3,23,11);
        // System.out.println(bv.volume);
        BoxWeight.message();
    }
}
