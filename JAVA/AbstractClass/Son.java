package AbstractClass;

public class Son extends Parent{

    @Override
    void career(String career) {
       System.out.println("I wanna become a "+ career);
    }

    @Override
    void partner(String name, int age) {
       System.out.println("I wanna marry "+name+" she is "+ age );
    }
    
}
