package com.ObjectOriented;

public class StudentTest {
	
	public String rollNo;
	public String name;
	public String branch;
	public int m1,m2,m3;
	
	public int total()
	{
		return (m1+m2+m3);
	}
	public int avg()
	{
		return (m1+m2+m3)/3;
	}
	public char grade()
	{
		if(avg()>=61)
		{
			return 'A';
		}
		else
		{
			return 'B';
		}
	}
	

}
