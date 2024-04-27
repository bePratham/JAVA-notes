package com.pratham.Spring.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    
    @RequestMapping("/m")
    public String myMethod(){
        return "I am my method with url";
    }
    @RequestMapping("/add")
    public String myMethodAdd(@RequestParam int num2,@RequestParam int num1){
        return "Result => "+(num1+num2);
    }
}
