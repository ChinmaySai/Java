package com.exceptionhandling.checkedunchecked;

public class UnCheckedException {
	
	static void fun1()
	{
		
		try
		{
			System.out.println(10/0);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		fun1();
	}

}
