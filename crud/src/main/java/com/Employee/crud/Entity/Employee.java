package com.Employee.crud.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
   private String name;
   private String number;
   private String email;
    private Long id;
    // public Employee(String name,String number,String email){
    //     this.name=name;
    //     this.email = email;
    //     this.number=number;
    // }
}
