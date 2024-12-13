package com.annotations;

class Parent1
{
	public void display()
	{
		
	}
}
class Child1 extends Parent
{
	@Override
	public void display()
	{
	System.out.println("Printing inside the Display method of child");	
	}
	@Deprecated
	public void show()
	{
		System.out.println("Printing in the show method");
	}
}


public class DeprecatedAnnotation {


    @SuppressWarnings("deprecated")
	public static void main(String[] args) {

		Child1 ch=new Child1();
		ch.show();
	}

}
