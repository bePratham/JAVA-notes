package SingletonClass;

public class Singleton {
    private Singleton(){
        System.out.println("I am singleton constructor");
    }
    private static Singleton instance;
    
    public static Singleton getSingletonInstance(){
        // if(instance == null){
        //     System.out.println("This is the first time i got called ...");
            instance = new Singleton();
        // }
        return instance;
    }
}
