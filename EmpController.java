package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.serviceimplementation.Servicesimplementation;


@RestController
@RequestMapping("/home")
public class EmpController {

	@Autowired
	Servicesimplementation si ;
	
	@PostMapping("/add")
	public Employee add(@RequestBody Employee e1) {
		return si.add(e1);
	}
	
	@DeleteMapping("/delete/{id}")
	public Employee delete(@PathVariable Integer id){
		return si.delete(id);
		
	}
		
}
