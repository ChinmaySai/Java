package threadtest;



class MyRunnableNew implements Runnable
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
public class JoinMethodExample
{
    public static void main(String[] args) throws InterruptedException {
        
        MyRunnableNew t=new MyRunnableNew();
        Thread th=new Thread(t);
        th.setDaemon(true);
        th.start();
        Thread mainThread=Thread.currentThread();
       mainThread.join();//Due to this line main thread will wait until the completion of Other Threads.
    }
    
}