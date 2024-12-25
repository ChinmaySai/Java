package com.ObjectOriented;

public class Circle {
	
	public double radius;
     public double caluculateArea()
     {
    	 return Math.PI*radius*radius;
     }
     public double calculatePerimeter()
     {
    	 return 2*Math.PI*radius;
     }
}
