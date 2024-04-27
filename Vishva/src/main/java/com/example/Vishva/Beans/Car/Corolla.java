package com.example.Vishva.Beans.Car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.example.Vishva.Beans.Interfaces.Car;
import com.example.Vishva.Beans.Interfaces.Engine;


public class Corolla implements Car {
    
    @Autowired
    @Qualifier("UnknownEngine")
    Engine engine;
    
    @Override
    public void specs() {
        // TODO Auto-generated method stub
       System.out.println("I am a sedan and i am using a "+engine.specs());
    }
}
