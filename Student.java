package com.student.entity;

public class Student {
	private int student_id;
	private String student_name;
	private String student_subject;
	private float student_percentage;
	private String student_city;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int student_id, String student_name, String student_subject, float student_percentage,
			String student_city) {
		super();
		this.student_id = student_id;
		this.student_name = student_name;
		this.student_subject = student_subject;
		this.student_percentage = student_percentage;
		this.student_city = student_city;
	}
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public String getStudent_subject() {
		return student_subject;
	}
	public void setStudent_subject(String student_subject) {
		this.student_subject = student_subject;
	}
	public float getStudent_percentage() {
		return student_percentage;
	}
	public void setStudent_percentage(float student_percentage) {
		this.student_percentage = student_percentage;
	}
	public String getStudent_city() {
		return student_city;
	}
	public void setStudent_city(String student_city) {
		this.student_city = student_city;
	}
	@Override
	public String toString() {
		return "Student [student_id=" + student_id + ", student_name=" + student_name + ", student_subject="
				+ student_subject + ", student_percentage=" + student_percentage + ", student_city=" + student_city
				+ "]";
	}
	
	
}
