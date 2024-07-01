package com.student.services;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.student.dbconnection.StudentDbConnection;
import com.student.repository.StudentRepository;

public class StudentServices implements StudentRepository {

	//create scanner class
	Scanner s = new Scanner(System.in);
	
	//write queries for all 
	String create = "insert into tblstudent(student_id,student_name,student_subject, student_percentage, student_city)"+"values(?,?,?,?,?)";
	
	String read = "select * from tblstudent";
	
	String update = "update tblstudent set student_name = ?,student_subject =?, student_percentage=?, student_city =? where student_id = ?";
	
	String delete = "delete from tblstudent where student_id = ?";
	
	public void create() throws SQLException, IOException {
		PreparedStatement ps = StudentDbConnection.getConnection().prepareStatement(create);
		
		//take input from user
		System.out.println("Enter student id : ");
		int id = s.nextInt();
		
		System.out.println("Enter student name : ");
		String name = s.next();
		
		System.out.println("Enter student subject : ");
		String subject = s.next();
		
		System.out.println("Enter student percentage : ");
		float percentage = s.nextFloat();
		
		System.out.println("Enter student city : ");
		String city = s.next();
		
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setString(3, subject);
		ps.setFloat(4, percentage);
		ps.setString(5, city);
		
		ps.executeUpdate();
	}
	
	public void read() throws SQLException, IOException {
		
		PreparedStatement ps = StudentDbConnection.getConnection().prepareStatement(read);
		
		//to get result use ResultSet class
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			System.out.println(rs.getInt(1) + " | " + rs.getString(2) + " | "+ rs.getString(3)+ " | " + rs.getFloat(4)+ " | " + rs.getString(5));
		}
	}
	
	public void update() throws SQLException, IOException {
		
		PreparedStatement ps = StudentDbConnection.getConnection().prepareStatement(update);
		System.out.println("updating.......");
		//now take new data from user
		
	
		System.out.println("Enter student name : ");
		String name = s.next();
		
		System.out.println("Enter student subject : ");
		String subject = s.next();
		
		System.out.println("Enter student percentage : ");
		float percentage = s.nextFloat();
		
		System.out.println("Enter student city : ");
		String city = s.next();
		
		System.out.println("Enter student id : ");
		int id = s.nextInt();
		
		
		
		
		ps.setString(1, name);
		ps.setString(2, subject);
		ps.setFloat(3, percentage);
		ps.setString(4, city);
		ps.setInt(5, id);
		ps.executeUpdate();
		
		System.out.println("data updated successfully");
	}
	
	public void delete() throws SQLException, IOException {
		
		PreparedStatement ps = StudentDbConnection.getConnection().prepareStatement(delete);
		
		//take user input to delete record
		System.out.println("Enter student id to delete record : ");
		int id = s.nextInt();
		
		ps.setInt(1, id);
		ps.executeUpdate();
		System.out.println("Data deleted successfully");
		
	}
}
