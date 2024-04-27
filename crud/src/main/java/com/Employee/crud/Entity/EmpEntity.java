package com.Employee.crud.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "emp_db")
public class EmpEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String name;
    private String number;
    private String email;
    private Long id;
}
