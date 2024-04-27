package Interface;

public class MediaPlayer implements Media {

    @Override
    public void start() {
        // TODO Auto-generated method stub
        System.out.println("Media Player started");
    }


    @Override
    public void stop() {
        System.out.println("Media Player Stopped");
    }
    
}
