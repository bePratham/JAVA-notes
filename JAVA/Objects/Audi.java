package Objects;

class Car {
    String name;
    String Engine;
    int seats;
    int wheels;
    Car(String name,String Engine,int seats){
        this.name=name;
        this.Engine=Engine;
        this.seats=seats;
    }
    Car(String name,int wheels){
        this.name=name;
        this.wheels=wheels;
    }
}
public class Audi{
    public static void main(String[] args) {
        // Car audi = new Car("Audi","V8",2);
        // Car bmw = new Car("BMW","v6",4);
        // System.out.println("Car name : "+audi.name+"Engine Type : "+audi.Engine+", Seats no. "+audi.seats);
        // System.out.println("Car name : "+bmw.name+"Engine Type : "+bmw.Engine+", Seats no. "+bmw.seats);       
        // Car lambo = new Car("Lamborghini", "v8", 2);
        // System.out.println("Car name : "+lambo.name+", Engine Type : "+lambo.Engine+", Seats no. "+lambo.seats);      
        
        
        Car maruti = new Car("Alto" , 4);
        System.out.println(maruti.name+"  __> wheels "+ maruti.wheels);
        maruti.name="Punch";
        System.out.println(maruti.name+"  __> wheels "+ maruti.wheels);

    }
}
