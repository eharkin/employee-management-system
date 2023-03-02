package com.employee.crud.controller;

import com.employee.crud.model.Employee;
import com.employee.crud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping(value = "/findAllEmployees")
    public Iterable<Employee> getEmployee() {
        return employeeService.getEmployee();
    }
}
