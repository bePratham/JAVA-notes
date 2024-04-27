package com.example.Vishva.DependencyInjection.specs;

import org.springframework.stereotype.Component;

import com.example.Vishva.DependencyInjection.Interfaces.Engine;

@Component
public class V6 implements Engine {

    @Override
    public String specs() {
        // TODO Auto-generated method stub
        return "v6 Engine";
    }
}
