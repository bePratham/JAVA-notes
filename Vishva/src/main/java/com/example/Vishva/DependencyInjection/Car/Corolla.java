package com.example.Vishva.DependencyInjection.Car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.example.Vishva.DependencyInjection.Interfaces.Car;
import com.example.Vishva.DependencyInjection.Interfaces.Engine;

@Component("C")
public class Corolla implements Car {
    @Autowired(required = false)
    @Qualifier("v6")
    Engine engine;

    @Override
    public void specs() {
        // TODO Auto-generated method stub
       System.out.println("I am a sedan and i am using a "+engine.specs());
    }
}
