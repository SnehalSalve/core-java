//package com.onetomany.demo;
//import java.util.List;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.OneToMany;
//import javax.persistence.Table;
//
//
//@Entity
//@Table(name = "oneteacher")
//public class Teacher {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "teacher_id")
//	private int teacher_id;
//	@Column(name = "teacher_name")
//	private String teacher_name;
//	@Column(name = "teacher_salary")
//	private float teacher_salary;
//	@Column(name = "teacher_city")
//	private String teacher_city;
//	
//	@OneToMany(targetEntity = Student.class)
//	private List student;
//	
//	public Teacher() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	public Teacher(int teacher_id, String teacher_name, float teacher_salary, String teacher_city, List student) {
//		super();
//		this.teacher_id = teacher_id;
//		this.teacher_name = teacher_name;
//		this.teacher_salary = teacher_salary;
//		this.teacher_city = teacher_city;
//		this.student = student;
//	}
//
//	public int getTeacher_id() {
//		return teacher_id;
//	}
//
//	public void setTeacher_id(int teacher_id) {
//		this.teacher_id = teacher_id;
//	}
//
//	public String getTeacher_name() {
//		return teacher_name;
//	}
//
//	public void setTeacher_name(String teacher_name) {
//		this.teacher_name = teacher_name;
//	}
//
//	public float getTeacher_salary() {
//		return teacher_salary;
//	}
//
//	public void setTeacher_salary(float teacher_salary) {
//		this.teacher_salary = teacher_salary;
//	}
//
//	public String getTeacher_city() {
//		return teacher_city;
//	}
//
//	public void setTeacher_city(String teacher_city) {
//		this.teacher_city = teacher_city;
//	}
//
//	public List getStudent() {
//		return student;
//	}
//
//	public void setStudent(List student) {
//		this.student = student;
//	}
//
//	@Override
//	public String toString() {
//		return "Teacher [teacher_id=" + teacher_id + ", teacher_name=" + teacher_name + ", teacher_salary="
//				+ teacher_salary + ", teacher_city=" + teacher_city + ", student=" + student + "]";
//	}
//
//	
//}
