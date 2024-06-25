package com.interfaces.demo;

public class Test {

	public static void main(String[] args) {
		
		I1 i1 = new Child();
		i1.demo();
		
		
		I2 i2 = new Child();
		i2.data();
		i2.demo();
	}

}
