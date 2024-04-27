package com.example.Vishva.Beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.Vishva.Beans.Car.Corolla;
import com.example.Vishva.Beans.Car.Swift;
import com.example.Vishva.Beans.Interfaces.Engine;
import com.example.Vishva.Beans.Interfaces.EngineType;
import com.example.Vishva.Beans.specs.V6;
import com.example.Vishva.Beans.specs.V8;

@Configuration
@ComponentScan("com.example")
public class AppConfig {
    @Bean("corolla")
    public Corolla corolla(){
        return new Corolla();
    }
    @Bean("swift")
    public Swift swif(){
        return new Swift();
    }
    // @Bean("v6")
    // public V6 V6(){
    //     return new V6();
    // }
    // @Bean("v8")
    // public V8 V8(){
    //     return new V8();
    // }
    @Bean("UnknownEngine")
    public EngineType type(){
        return new EngineType("v12");
    }
}
