package Interface;

public class Main {
    public static void main(String[] args) {
        Engine car=new PetrolEngine();
        car.start();
        car.acc();
        car.acc();
        Media carMedia = new MediaPlayer();
        carMedia.start();
        Engine newEngine=new ElectricEngine();
        newEngine.start();
        newEngine.stop();
    }
}
