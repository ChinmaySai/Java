package com.example.enumex;
enum Dept
{
	CS,IT,CIVIL,ECE;
}
public class EnumExample {

	public static void main(String[] args) {
		Dept dt=Dept.IT;
		System.out.println(dt.ordinal());
		System.out.println(dt.valueOf("CS"));
		Dept []dep=Dept.values();
	    for(Dept d:dep)
	    {
	    	System.out.println(d);
	    }
	    switch(dt)
	    {
	    case CS:System.out.println("Head:Chinmay  \nBlock 1");
	            break;
	    case IT:System.out.println("Head:Sai  \nBlock 2");
                break;
	    case CIVIL:System.out.println("Head:George  \nBlock 3");
        break;
	    case ECE:System.out.println("Head:ECE Head \nBlock 4");
        break;
	    }
	}
}
