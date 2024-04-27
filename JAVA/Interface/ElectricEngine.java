package Interface;

public class ElectricEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Electric Engine is started");
    }

    @Override
    public void acc() {
        System.out.println("Power up our engine");
    }

    @Override
    public void stop() {
       System.out.println(" DisEngage our EEngine");
    }

}
