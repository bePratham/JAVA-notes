package Inheritance;

public class BoxVolume extends BoxWeight {
    double volume;
    BoxVolume(){
        super();
        System.out.println("I am in Box Volume");

    }
    BoxVolume(double l, double b, double h, double weight,double volume) {
        super(l, b, h,weight);
        // this.weight = weight;
        this.volume=volume;
    }
}
