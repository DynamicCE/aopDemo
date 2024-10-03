package com.erkan.aopDemo.service;

import com.erkan.aopDemo.model.Employee;
import com.erkan.aopDemo.repo.EmployeeRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public
class EmployeeService {
    private
    EmployeeRepo employeeRepo;

    public
    EmployeeService ( EmployeeRepo employeeRepo ) {
        this.employeeRepo = employeeRepo;
    }

    public
    List<Employee> findAllEmps () {
        System.out.println ( "" );
        return employeeRepo.findAll ();
    }

    public
    Employee save ( Employee employee ) {
        return employeeRepo.save ( employee );
    }


}
