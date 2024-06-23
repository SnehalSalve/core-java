//package com.onetomany.demo;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "onestudent")
//public class Student {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "student_rollno")
//	private int stud_rollno;
//	@Column(name = "student_name")
//	private String stud_name;
//	@Column(name = "student_city")
//	private String stud_city;
//	
//	public Student() {
//		super();
//		
//	}
//
//	public Student(int stud_rollno, String stud_name, String stud_city) {
//		super();
//		this.stud_rollno = stud_rollno;
//		this.stud_name = stud_name;
//		this.stud_city = stud_city;
//	}
//
//	public int getStud_rollno() {
//		return stud_rollno;
//	}
//
//	public void setStud_rollno(int stud_rollno) {
//		this.stud_rollno = stud_rollno;
//	}
//
//	public String getStud_name() {
//		return stud_name;
//	}
//
//	public void setStud_name(String stud_name) {
//		this.stud_name = stud_name;
//	}
//
//	public String getStud_city() {
//		return stud_city;
//	}
//
//	public void setStud_city(String stud_city) {
//		this.stud_city = stud_city;
//	}
//
//	@Override
//	public String toString() {
//		return "Student [stud_rollno=" + stud_rollno + ", stud_name=" + stud_name + ", stud_city=" + stud_city + "]";
//	}
//	
//	
//}
