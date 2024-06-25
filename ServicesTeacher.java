package com.inhereitence.person;

import java.util.Scanner;

public class ServicesTeacher {

	Teacher teacher =  new Teacher();
	Scanner s1 = new Scanner(System.in);
	public void data() {
		System.out.println("enter salary ");
		float salary = s1.nextFloat();
		teacher.setSalary(salary);
	}
	
	public void display() {
		System.out.println("salary is : "+teacher.getSalary());
	}
}
