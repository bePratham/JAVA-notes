package com.example.Vishva.Beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// import com.example.Vishva.Beans.Car.Corolla;
// import com.example.Vishva.Beans.Car.Swift;
import com.example.Vishva.Beans.Interfaces.Car;

public class App {
    public static void main(String[] args) {
        // Car swift = new Swift();
        // swift.specs();
        // Car corolla = new Corolla();
        // corolla.specs();
        
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Car myCar = context.getBean("corolla", Car.class);
        myCar.specs();
        context.close();
    }
}
