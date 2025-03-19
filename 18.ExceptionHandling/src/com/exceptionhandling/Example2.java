package com.exceptionhandling;

/**
 * 
 * Java Program for try with Multiple catch blocks
 * 
 */
public class Example2 {

	public static void main(String[] args) {


		
		try
		{

			int a=20,b,c2=0;
			int d=a/c2;
		
	}
		catch(ArithmeticException e)
		{
		 System.out.println(e);
		 
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		}

}
