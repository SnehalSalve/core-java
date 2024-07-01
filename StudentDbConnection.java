package com.student.dbconnection;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class StudentDbConnection {

	public static Connection getConnection() throws IOException, SQLException {
		File f1 = new File("D:\\Sayali_Study\\CRUD\\src\\main\\resources\\DBproperties");
		FileInputStream f2 = new FileInputStream(f1);
		
		Properties p1 = new Properties();
		p1.load(f2);
		String url = p1.getProperty("url");
		String user = p1.getProperty("user");
		String password = p1.getProperty("password");
		
		Connection connection = DriverManager.getConnection(url,user,password) ;
		return connection;
		
	}
}
