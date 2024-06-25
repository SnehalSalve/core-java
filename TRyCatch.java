package com.exceptionhandling.demo;

import java.util.Scanner;

public class TRyCatch {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter first number : ");
		
		try{
			int a= s1.nextInt();
			System.out.println("Enter second number : ");
			int b = s1.nextInt();
			int result = a/b; //exception causing statement
			System.out.println("result is :"+result);
		}catch (Exception e) {
			System.out.println("please enter proper data");
		}
		
	}

}
