package com.pratham.demo.Beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.pratham.demo.Beans.Car.Corolla;
import com.pratham.demo.Beans.Car.Swift;
import com.pratham.demo.Beans.specs.EngineType;
import com.pratham.demo.Beans.specs.V6;
import com.pratham.demo.Beans.specs.V8;
import com.pratham.demo.DependencyInjection.Car.Engine;

@Configuration
@ComponentScan("com.pratham")
public class AppCongfig {
    @Bean("corolla")
    public Corolla corolla() {
        return new Corolla();
    }

    @Bean("swift")
    public Swift swift() {
        return new Swift();
    }

    // @Bean("v6")
    // public V6 v6(){
    // return new V6();
    // }
    // @Bean("v8")
    // public V8 v8(){
    // return new V8();
    // }
    @Bean("UnknownEngine")
    public EngineType type() {
        return new EngineType("v12");

    }
}
