package com.example.abstractclass;
abstract class KFC
{
	public abstract void  makeItem();
	KFC()
	{
		
	}
	public  void billing()
	{
		System.out.println("Billing");
	}
	public abstract void offer();
	
	
}
class MyKFC extends KFC
{

	@Override
	public void makeItem() {
		
	}

	@Override
	public void offer() {
		
	}
	
}

public class AbstractClassExample2 {

}
