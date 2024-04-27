package pratham.FirstClass;

public class firstprogram {
    public void checking(){
        System.out.println("HII i am at firstprogram");
    }
}
class second{
    public static void main(String[] args) {
        firstprogram obj2=new firstprogram();
        obj2.checking();
    }
}