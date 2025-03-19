package com.exceptionhandling.checkedunchecked;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {
	
	static void fun1() throws FileNotFoundException
	{
	FileInputStream f1=new FileInputStream("MyFile.txt");	
	}
	public static void main(String[] args) {
		try {
			fun1();
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
			e.printStackTrace();
		}
	}

}
