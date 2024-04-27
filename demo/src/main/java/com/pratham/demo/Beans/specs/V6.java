package com.pratham.demo.Beans.specs;

// import org.springframework.stereotype.Component;

import com.pratham.demo.DependencyInjection.Interfaces.Engine;


public class V6 implements Engine {

    @Override
    public String specs() {
       return "V6 Engine";
    }
    
}
