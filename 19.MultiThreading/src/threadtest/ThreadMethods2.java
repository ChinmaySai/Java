package threadtest;



class MyRunnable implements Runnable
{
    public void run()
    {
        int i=1;
        while(true)
        {
            System.out.println(i+"Hello");
            i++;
        }
    }
}
public class ThreadMethods2
{
    
    
    public static void main(String[] args) {
        
        MyRunnable t=new MyRunnable();
        Thread th=new Thread(t);
        th.setDaemon(true);
        th.start();
        try
        {
        	Thread.sleep(1000);
        }
        catch(Exception e)
        {
        	
        }
    }
    
}