package com.employee.crud.service;

import com.employee.crud.model.Employee;
import com.employee.crud.repository.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class EmployeeService {

    @Autowired EmployeeRepository employeeRepository;

    @Cacheable(value = "employeeCache", key = "#employeeId")
    public Iterable<Employee> getEmployee() {
        return employeeRepository.findAll();
    }
}
