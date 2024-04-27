package com.Employee.crud;

import java.util.List;

import com.Employee.crud.Entity.Employee;


public interface EmpService {
    Employee createEmployee(Employee emp);
    List<Employee> readEmployees();
    boolean deleteEmployee(Long id);
}
