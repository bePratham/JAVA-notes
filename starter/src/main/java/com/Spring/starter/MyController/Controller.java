package com.Spring.starter.MyController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    @RequestMapping("/mymethod")
    public String myMethod(){
        return "I am in myMethod with this url";
    }
    @RequestMapping("/add")
    public String myMethodAdd(@RequestParam int num2,@RequestParam int num1){
        return "Result => "+(num1+num2);
    }
}
