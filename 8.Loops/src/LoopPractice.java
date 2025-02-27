
public class LoopPractice {

	public static void main(String args[])
	{
		System.out.println("While Loop");
	
		int i=1;
        while(i<100)
        {
            System.out.println(i);
            i=i*2;
        }
        
        System.out.println("Do While Loop");
        i=1;
        do
        {
            System.out.println(i);
            i=i*2;
        }while(i<100);
        
        
        byte i1=1;
        
        System.out.println("If Statemnt");
        if(true)
        {
            System.out.println(i1);
            i1++;
        }
        else
            System.out.println("Bye");
	}
	}
