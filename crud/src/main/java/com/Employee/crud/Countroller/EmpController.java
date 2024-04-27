package com.Employee.crud.Countroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Employee.crud.EmpService;
import com.Employee.crud.Entity.Employee;

@RestController
public class EmpController {
    // @Autowired
    // EmpService empService = new EmployeeServiceImpl();
    
    @Autowired
    EmpService empService;
    // List<Employee> employees=new ArrayList<>();

    
    @GetMapping("employees")
    public List<Employee> getAllEmmployees(){
        // employees.add(new Employee("Pratham", "1234", "vishva@gmail.com"));
        // employees.add(null);
        // return employees;

        return empService.readEmployees();
    }
    @PostMapping("employees")
    public String createEmployee(@RequestBody Employee employee){
        // employees.add(employee);
        empService.createEmployee(employee);
        return "Saved Successfull";
    }
    @DeleteMapping("employees/{id}")
    public String deleEmployee(@PathVariable Long id){
        empService.deleteEmployee(id);
        return "true";
    }
}
