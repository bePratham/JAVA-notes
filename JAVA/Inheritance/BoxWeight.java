package Inheritance;

public class BoxWeight extends Box {
    double weight;

    BoxWeight() {
        super();
        System.out.println("I am in Boxweight right now...");
    }
    
    BoxWeight(double l, double b, double h, double weight) {
        super(l, b, h);
        this.weight = weight;
    }
}
