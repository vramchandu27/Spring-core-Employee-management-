package com.Employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Employee.Repository.EmployeeRepository;
import com.Employee.model.Employee;

@Service

public class Employeeservice {
	
    @Autowired
	private EmployeeRepository repo;
    public Employee addEmployee(Employee employee){ return repo.save(employee); }

    //view
    public List<Employee> viewEmployee() { return repo.findAll(); }

    //update
 public Employee updateEmployee(long rollno, Employee employee ){ return repo.save(employee); }

    //delete
    public void deleteData(long rollno){
        repo.deleteById(rollno);
    }

}
