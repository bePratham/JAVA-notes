package com.pratham.demo.DependencyInjection;
import com.pratham.demo.DependencyInjection.Interfaces.Car;
import com.pratham.demo.DependencyInjection.Car.Swift;
import com.pratham.demo.DependencyInjection.Car.Corolla;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App{
    public static void main(String[] args) {
        // Car o1 = new Swift();
        // o1.specs();
        // Car o2 = new Corolla();
        // o2.specs();

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppCongfig.class);
        Car myCar = context.getBean("corolla",Car.class);
        myCar.specs();
        context.close();
    }
}