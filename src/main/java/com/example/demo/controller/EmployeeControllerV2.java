package com.example.demo.controller;

import com.example.demo.entity.Employee;
import com.example.demo.entity.EmployeeV2;
import com.example.demo.service.EmployeeV2Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v2/employees")
public class EmployeeControllerV2 {
    private final EmployeeV2Service employeeV2Service;
    public EmployeeControllerV2(EmployeeV2Service employeeV2Service){
        this.employeeV2Service = employeeV2Service;
    }
    @PostMapping
    public EmployeeV2 saveEmployee(@RequestBody EmployeeV2 employeeV2){
        return employeeV2Service.addEmployee(employeeV2);
    }

    @GetMapping
    public List<EmployeeV2> getAllEmployee(){
        return employeeV2Service.getAllEmployee();
    }

    @GetMapping("/{id}")
    public EmployeeV2 getEmployeeById(Long id){
        return employeeV2Service.getById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(Long id){
        employeeV2Service.deleteById(id);
    }
}
