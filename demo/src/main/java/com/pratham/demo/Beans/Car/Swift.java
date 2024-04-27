package com.pratham.demo.Beans.Car;
import org.springframework.stereotype.Component;

import com.pratham.demo.Beans.Interfaces.Car;


public class Swift implements Car {

    @Override
    public void specs() {
        // TODO Auto-generated method stub
        System.out.println("I am a hatch back");
    }
    
}
