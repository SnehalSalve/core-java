package com.example.demo.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmpRepository;
import com.example.demo.services.EmpServices;

@Service
public class Servicesimplementation implements EmpServices{

	@Autowired
	EmpRepository emprepository;
	
	@Override
	public Employee add(Employee employee) {
		// TODO Auto-generated method stub
		return emprepository.save(employee);
	}

	@Override
	public Employee delete(int id) {
		// TODO Auto-generated method stub
		emprepository.deleteById(id);
		return null;
	}

	@Override
	public List<Employee> getData() {
		// TODO Auto-generated method stub
		return emprepository.findAll();
	}

	@Override
	public Employee update(Employee employee) {
		// TODO Auto-generated method stub
		
		Employee e1 = emprepository.findById(employee.getId()).get();
		
		e1.setName(e1.getName());
		e1.setCity(e1.getCity());
		Employee e2 = emprepository.save(e1);
		return emprepository.save(employee);
	}

	
}
