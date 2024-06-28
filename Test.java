package com.exceptionhandling.demo;

import java.sql.Connection;
import java.sql.DriverManager;

public class Test {

	public static void main(String[] args) {
		
		String user ="root";
		String password = "@Payal221995";
		String url = "jdbc:mysql://localhost:3306/combine";
		
		try {
			Connection connection = DriverManager.getConnection(url,user,password);
			System.out.println("hello connection");
		}catch (Exception e) {
			System.out.println("sql exception");
		}
	}

}
