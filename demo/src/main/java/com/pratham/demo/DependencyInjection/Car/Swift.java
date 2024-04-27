package com.pratham.demo.DependencyInjection.Car;
import org.springframework.stereotype.Component;

import com.pratham.demo.DependencyInjection.Interfaces.Car;
@Component
public class Swift implements Car {

    @Override
    public void specs() {
        // TODO Auto-generated method stub
        System.out.println("I am a hatch back");
    }
    
}
