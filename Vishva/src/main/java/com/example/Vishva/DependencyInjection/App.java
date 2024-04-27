package com.example.Vishva.DependencyInjection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// import com.example.Vishva.DependencyInjection.Car.Corolla;
// import com.example.Vishva.DependencyInjection.Car.Swift;
import com.example.Vishva.DependencyInjection.Interfaces.Car;

public class App {
    public static void main(String[] args) {
        // Car swift = new Swift();
        // swift.specs();
        // Car corolla = new Corolla();
        // corolla.specs();
        
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Car myCar = context.getBean("C", Car.class);
        myCar.specs();
        context.close();
    }
}
