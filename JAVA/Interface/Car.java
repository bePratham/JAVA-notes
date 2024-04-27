package Interface;

public class Car implements Brake,Engine,Media {

    @Override
    public void start() {
        System.out.println(" starting our engine");
    }

    @Override
    public void acc() {
        System.out.println("Speeding up");
    }

    @Override
    public void stop() {
       System.out.println(" Stopping our engine");
    }

    @Override
    public void brake() {
        System.out.println("Brakes are applied");
    }
    
}
