
package com.example.staticex;
class Honda
{
	static int price=10;
	static double val=0;
	static double onRoadPrice(String loc)
	{
		switch(loc)
		{
		case "Delhi":
			val=price*price+0.01;
			break;
		case "Bengaluru":
			val=price*price+0.09;
			break;
		 default:
			 val=price*price+0.05;
			 break;
			 
		}
		return val;
	}
}
public class StaticExample1 {
	public static void main(String args[])
	{
	Honda h1=new Honda();
	Honda h2= new Honda();
	System.out.println(h1.price);
	System.out.println(h2.price);
    System.out.println("h1.onRoadPrice(\"Delhi\") --> "+h1.onRoadPrice("Delhi"));

	}
}
