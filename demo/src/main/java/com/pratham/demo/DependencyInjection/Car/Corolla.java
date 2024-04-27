package com.pratham.demo.DependencyInjection.Car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import com.pratham.demo.DependencyInjection.Interfaces.Engine;
import com.pratham.demo.DependencyInjection.Interfaces.Car;

@Component
public class Corolla implements Car {
    // // @Autowired(required = false)
    // Engine engine;

    // // public Corolla(Engine engine) {
    // //     engine.type="v6";
    // //     // this.engine = engine;
    // // }

    // @Autowired
    // public void setEngine(Engine engine){
    //     engine.type="v10";
    //     this.engine= engine;
    // }

    @Autowired
    @Qualifier("v8")
    Engine engine; //engine //v6,8

    @Override
    public void specs() {
        System.out.println(" I am a sedan from Toyota , and i am having " + engine.specs());
    }

}
