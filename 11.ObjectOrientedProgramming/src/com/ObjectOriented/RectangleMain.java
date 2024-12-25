package com.ObjectOriented;

import java.util.*;
public class RectangleMain {

	public static void main(String[] args) {
             
		Rectangle rectObj=new Rectangle();
		/*
		 * rectObj.length=5.2; rectObj.breadth=2.3;
		 */
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of rectangle :");
        rectObj.length=sc.nextDouble();
        System.out.print("Enter the breadth of rectangle :");
        rectObj.breadth=sc.nextDouble();
		System.out.println("Area of the rectangle "+rectObj.area());
		System.out.println("Perimeter of the rectangle "+rectObj.perimeter());
		System.out.println("Is it Square : "+rectObj.isSquare());
		
		
		
	}

}
