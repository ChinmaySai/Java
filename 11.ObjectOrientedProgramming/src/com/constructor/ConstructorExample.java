package com.constructor;

class RectangleTest
{
    private double length;
    private double breadth;
	public RectangleTest(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	public RectangleTest() {
		super();
	}
    
     
}
        

public class ConstructorExample {

    public static void main(String[] args) {
        RectangleTest r=new RectangleTest();
        RectangleTest r1=new RectangleTest(10,25);

       }
    
}