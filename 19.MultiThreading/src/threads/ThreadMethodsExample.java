package threads;

class Thread1 implements Runnable
{
	@Override
      public void run()
      {
		int i=0;
		while(i<=10)
		{
			System.out.println("Thread 1 "+i);
			i++;
		}
      }
}
class Thread2 extends Thread
{
	@Override
	public void run()
	{
		int i=1000;
		while(i>=10)
		{
			System.out.println("Thread 2 "+i);
			i--;
		}
		
	}
}
public class ThreadMethodsExample {

	public static void main(String[] args) {

		Thread1 timpl=new Thread1();
		Thread t1=new Thread(timpl);
		Thread2 t2=new Thread2();
	    t1.start();
	    t2.start();
	    //t1.setPriority(Thread.NORM_PRIORITY+2);
	    try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
	    
	}

}
