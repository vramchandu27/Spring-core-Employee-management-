package com.Employee.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Employee.Repository.EmployeeRepository;
import com.Employee.model.Employee;
import com.Employee.service.Employeeservice;


@RestController
@RequestMapping("/emp")
public class Employeecontroller {
	
	
	private static final org.apache.logging.log4j.Logger LOG = LogManager.getLogger(Employeecontroller.class);

    @Autowired
    private Employeeservice service;

    @PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee employee){
        LOG.info("Adding Employee");
        return service.addEmployee(employee);
    }

    @GetMapping("/view")
    public List<Employee> viewEmployee(){
        LOG.info("Viewing data");
        return service.viewEmployee();

    }
    @PutMapping("/update/{rollno}")
    public Employee updateEmployee (@PathVariable("rollno") long rollno, Employee employee){
        LOG.info("Updating the Employee with Roll No: " + rollno);
        return service.updateEmployee(rollno, employee);

    }
    @DeleteMapping("/delete/{rollno}")
    public void deleteEmployee(@PathVariable("rollno") long rollno){
        LOG.info("Deleting the Student with Roll No: " + rollno);
        service.deleteData(rollno);


    }
	
}
