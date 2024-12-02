package com.introduction;
import java.util.Scanner;
public class DataInput {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers :");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Sum of two numbers :"+(a+b));
		
		sc.useRadix(2);
		System.out.println("Enter Binary Number :");
		a=sc.nextInt();
		System.out.println("Integer value of Entered Binary Number : "+a);
		
	}

}
