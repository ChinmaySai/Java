package com.ObjectOriented;


public class CircleMain {

	public static void main(String[] args) {

		Circle c1=new Circle();
		c1.radius=10;
		System.out.println("The Area of circle "+c1.caluculateArea());
		System.out.println("The Perimeter of circle "+c1.calculatePerimeter());
	}

}
