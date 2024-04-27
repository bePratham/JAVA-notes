package Ploymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shapes = new Shapes();
        Shapes circShapes= new Circle();
        Shapes rectShapes= new Square();
        Shapes squarShapes= new Rectangle();
        shapes.area();
        circShapes.area();
        rectShapes.area();
        squarShapes.area();
    }
}
