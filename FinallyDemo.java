package com.exceptionhandling.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FinallyDemo {

	public static void main(String[] args) throws SQLException {
		//finally block is used to de alloacte resources
		//finally block always execute without failed
		
		String user ="root";
		String password = "@Payal221995";
		String url = "jdbc:mysql://localhost:3306/combine";
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(url,user,password);
			System.out.println("hello connection");
		}catch (Exception e) {
			System.out.println("sql exception");
		}
		finally {
			connection.close();
			System.out.println("connection closed");
		}
		
	}

}
