package com.annotations;

class Parent
{
	public void display()
	{
		
	}
}
class Child extends Parent
{
	@Override
	public void display()
	{
		
	}
	@Deprecated
	public void show()
	{
		
	}
}


public class AnnotationDemo {

	public static void main(String[] args) {

		Child ch=new Child();
		ch.show();
	}

}
