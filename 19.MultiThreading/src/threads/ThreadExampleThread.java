package threads;

class MyThread extends Thread
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

public class ThreadExampleThread
{
    
    public static void main(String[] args) {
        
        
        MyThread th=new MyThread();
        
        th.start();
        
        int i=1;
        while(true)
        {
            System.out.println(i+"World");
            i++;
        }
        
    }
    
}