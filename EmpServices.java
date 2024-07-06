package com.example.demo.services;

import java.util.List;

import com.example.demo.entity.Employee;

public interface EmpServices {

	Employee add(Employee employee);
	Employee delete(int id);
	List<Employee> getData();
	Employee update(Employee employee);
}
