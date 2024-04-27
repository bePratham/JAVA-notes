package com.example.Vishva.Beans.Car;

import org.springframework.stereotype.Component;

import com.example.Vishva.Beans.Interfaces.Car;

public class Swift implements Car{

    @Override
    public void specs() {
        System.out.println("I am a hatch back");
    }
    
}
