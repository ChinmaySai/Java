package com.ObjectOriented;

public class Rectangle {
	
	public double length,breadth;
	
	public double area()
	{
		return length*breadth;
	}
	public double perimeter()
	{
		return 2*(length*breadth);
	}
	public boolean isSquare()
	{
		if(length==breadth)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	

}
