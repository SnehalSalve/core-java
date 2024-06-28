package com.singlton.demo;

public class Data {

	 static Data d1 =  new Data();
	private Data(){
		System.out.println("inside private data method");
	}
	
	
	static Data demo() {
		
		return d1;
	}
}
