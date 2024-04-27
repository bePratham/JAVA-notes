package com.example.Vishva.DependencyInjection.Car;

import org.springframework.stereotype.Component;

import com.example.Vishva.DependencyInjection.Interfaces.Car;

@Component("S")
public class Swift implements Car{

    @Override
    public void specs() {
        System.out.println("I am a hatch back");
    }
    
}
