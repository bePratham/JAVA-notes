package com.example.Vishva.DependencyInjection.specs;

import org.springframework.stereotype.Component;

import com.example.Vishva.DependencyInjection.Interfaces.Engine;

@Component
public class V8 implements Engine{

    @Override
    public String specs() {
        // TODO Auto-generated method stub
        return "V8 Engine ";
    }
    
}
