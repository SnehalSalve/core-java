package com.exceptionhandling.demo;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		File f1 = new File("C:\\Users\\SAYALI\\Desktop\\j46\\frontend\\html\\home.html");
		
		FileInputStream f2 = null;
		
		try {
			System.out.println("file operation....");
			f2 = new FileInputStream(f1);
			f2.read();
			
			System.out.println("file is in read mode");
			String string = null;
			System.out.println(string.charAt(0));
			System.out.println("file found");
			
		}catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println("file not found");
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("string cant not be null");
		}finally {
			f2.close();
			System.out.println("file closed");
		}
	}
}
