package com.pratham.demo.DependencyInjection.specs;

import org.springframework.stereotype.Component;

import com.pratham.demo.DependencyInjection.Interfaces.Engine;

@Component
public class V8 implements Engine {

    @Override
    public String specs() {
        return "V8 Engine";
    }
    
}
