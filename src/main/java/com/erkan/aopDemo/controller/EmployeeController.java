package com.erkan.aopDemo.controller;

import com.erkan.aopDemo.model.Employee;
import com.erkan.aopDemo.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/code/")
public
class EmployeeController {
    private
    EmployeeService employeeService;

    public
    EmployeeController ( EmployeeService employeeService ) {
        this.employeeService = employeeService;
    }

    @GetMapping("all")
    public
    ResponseEntity<?> fetchAllEmployees(){
        return new ResponseEntity<List<Employee>> (employeeService.findAllEmps(), HttpStatus.OK );
    }

    @PostMapping("add")
    public ResponseEntity<?> addEmployer( @RequestBody Employee employee ){
        return new ResponseEntity<Employee> (employeeService.save(employee),HttpStatus.OK  );
    }

}
