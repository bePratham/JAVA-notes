package SingletonClass;

public class Main {
    public static void main(String[] args) {
        Singleton obj =Singleton.getSingletonInstance();
        Singleton obj2 =Singleton.getSingletonInstance();
        Singleton obj1 =Singleton.getSingletonInstance();
        Singleton obj3 =Singleton.getSingletonInstance();
        System.out.println(obj);
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
    }
}
