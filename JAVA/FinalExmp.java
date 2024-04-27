public class FinalExmp {
    public static void main(String[] args) {
        final int a=10;
        // System.out.println(n);
        System.out.println("a = "+a);
        
        final Int j=new Int(10);
        j.x=20;
        System.out.println(j.x);
    }
}
class Int{
    int x;
    Int(int x){
        this.x=x;
    }
}