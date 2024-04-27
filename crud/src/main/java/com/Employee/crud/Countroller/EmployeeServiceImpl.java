package com.Employee.crud.Countroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.Employee.crud.EmpService;
import com.Employee.crud.Entity.EmpEntity;
import com.Employee.crud.Entity.Employee;

@Component
public class EmployeeServiceImpl implements EmpService {
    List<Employee> employees=new ArrayList<>();
    @Override
    public Employee createEmployee(Employee emp) {
        employees.add(emp);
        return emp;
    }

    @Override
    public List<Employee> readEmployees() {
       return employees;
    }

    @Override
    public boolean deleteEmployee(Long id) {
        employees.remove(id);
        return true;
    }
}
