package Interface;

public class PetrolEngine implements Engine {
    @Override
    public void start() {
        System.out.println("PetrolEngine is started");
    }

    @Override
    public void acc() {
        System.out.println("Boosting up our engine");
    }

    @Override
    public void stop() {
       System.out.println(" DisEngage our PEngine");
    }

}
