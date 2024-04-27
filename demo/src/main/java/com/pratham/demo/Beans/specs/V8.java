package com.pratham.demo.Beans.specs;

// import org.springframework.stereotype.Component;

import com.pratham.demo.Beans.Interfaces.Engine;


public class V8 implements Engine {

    @Override
    public String specs() {
        return "V8 Engine";
    }
    
}
