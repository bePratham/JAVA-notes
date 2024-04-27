package Inheritance;

public class Box {
    double l;
    double b;
    double h;
    static void message(){
        System.out.println("Hello");
    }
    Box(){
        System.out.println("I am in Default Constructor");
        l=-1;
        b=-1;
        h=-1;
    }
    Box(double l,double b,double h){
        this.l=l;
        this.b=b;
        this.h=h;
    }
}
