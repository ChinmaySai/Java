package com.synchronization;

//Here the display method is the shared resource and it is getting called by both the threads.As there is no Synchronization 
//we could see output in the combined order of both the Strings.
class PrintedData
{
	public void display(String s)
	{
		for(int i=0;i<s.length();i++)
		{
			System.out.print(s.charAt(i));
		}
	}
	
}
class Thread1 extends Thread
{
	PrintedData d;
     Thread1(PrintedData d)
     {
    	 this.d=d;
     }
     @Override
     public void run()
     {
    	 d.display("Chinmay");
     }
}
class Thread2 extends Thread
{
	PrintedData d;
     Thread2(PrintedData d)
     {
    	 this.d=d;
     }
     @Override
     public void run()
     {
    	 d.display("George");
     }
}
public class MultiThreadingWithoutSynchronization {

	public static void main(String args[])
	{
		PrintedData d=new PrintedData();
		Thread1 t1=new Thread1(d);
		Thread2 t2=new Thread2(d);
		
		t1.start();
		t2.start();
		
	}
}
