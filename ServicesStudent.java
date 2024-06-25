package com.inhereitence.person;

import java.util.Scanner;

public class ServicesStudent {

	
	Student student = new Student();
	Scanner s1 = new Scanner(System.in);
	
	public void data() {
		System.out.println("enter id ");
		int id = s1.nextInt();
		
		System.out.println("enter name ");
		String name = s1.next();
		
		System.out.println("enter division ");
		String division = s1.next();
		
		
		System.out.println("enter city ");
		String city = s1.next();
		
		System.out.println("enter country ");
		String country = s1.next();
		
		student.setId(id);
		student.setName(name);
		student.setCity(city);
		student.setCountry(country);
		student.setDivison(division);
	}
	
	public void display() {
		System.out.println("id is : "+student.getId());
		System.out.println("name is : "+student.getName());
		System.out.println("division is : "+student.getDivison());
		System.out.println("city is : "+student.getCity());
		System.out.println("country is : "+student.getCountry());
	}
}
