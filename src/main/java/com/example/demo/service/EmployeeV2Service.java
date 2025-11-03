package com.example.demo.service;

import com.example.demo.entity.Employee;
import com.example.demo.entity.EmployeeV2;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.repository.EmployeeV2Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeV2Service {
    private final EmployeeV2Repository employeeV2Repository;
    public EmployeeV2Service(EmployeeV2Repository employeeV2Repository){
        this.employeeV2Repository = employeeV2Repository;
    }

    public EmployeeV2 addEmployee(EmployeeV2 employeeV2){
        return employeeV2Repository.save(employeeV2);
    }

    public List<EmployeeV2> getAllEmployee(){
        return employeeV2Repository.findAll();
    }
    public EmployeeV2 getById(Long id){
        return employeeV2Repository.findById(id).orElseThrow(()-> new RuntimeException("Employee not found"));
    }
    public void deleteById(Long id){
        employeeV2Repository.deleteById(id);
    }
}
