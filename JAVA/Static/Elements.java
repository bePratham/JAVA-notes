package Static;

public class Elements {
    
    static int a;
    static int b;
    static{
        a=10;
        b=20;
    }
    
    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(b);
    }
}
