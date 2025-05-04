package com.synchronization;

class PrintedData1
{
	public void display(String s)
	{
		synchronized(this)
		{
		for(int i=0;i<s.length();i++)
		{
			System.out.print(s.charAt(i));
		}
		}
	}
	
}
class Thread11 extends Thread
{
	PrintedData1 d;
     Thread11(PrintedData1 d)
     {
    	 this.d=d;
     }
     @Override
     public void run()
     {
    	 d.display("Chinmay");
     }
}
class Thread22 extends Thread
{
	PrintedData1 d;
     Thread22(PrintedData1 d)
     {
    	 this.d=d;
     }
     @Override
     public void run()
     {
    	 d.display("George");
     }
}
public class SynchronizedBlock {

	public static void main(String args[])
	{
		PrintedData1 d=new PrintedData1();
		Thread11 t1=new Thread11(d);
		Thread22 t2=new Thread22(d);
		
		t1.start();
		t2.start();
		
	}
}
