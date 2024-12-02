package com.datatypes;

public class Literals {

	public static void main(String[] args) {

		byte decimal=10;
		byte binary=0b1010;
		byte octal=012;
		byte hexaDecimal=0XA;

		System.out.println(decimal);
		System.out.println(binary);
		System.out.println(octal);
		System.out.println(hexaDecimal);
		
		long l=125;
		float f=12.6f;
		double d=12.56;
		System.out.println(f);
		System.out.println(d);
		
		int val=900_01_85; //We can write Underscores in b/w numbers to increase the readability
		float val1=120.1f;
		System.out.println(val1);
		System.out.println(val);
		
	}

}
