package com.spring.demo;

public class Student {

	private int id;
	private String name;
	private String city;
	
	private Dept dept;
	public Student() {
		super();
	}
	
	public Student(int id, String name, String city, Dept dept) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.dept = dept;
	}

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}
