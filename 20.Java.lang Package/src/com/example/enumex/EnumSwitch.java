package com.example.enumex;
enum StatusNew{
	Running, Failed, Pending, Success;
}

public class EnumSwitch {
    public static void main(String[] args) {

    	StatusNew s=StatusNew.Pending;
    	
    	switch(s)
    	{
    		case Running:
    			System.out.println("All Good");
    			break;
    			
    		case Failed:
    			System.out.println("Try Again");
    			break;
    			
    		case Pending:
    			System.out.println("Please Wait");
    			break;
    		
    		default:
    			System.out.println("Done");
    			break;
    	}
    	
    	if(s==StatusNew.Running)
    		System.out.println("All Good");
    	else if(s==StatusNew.Failed)
    		System.out.println("Try Again");
    	else if ( s==StatusNew.Pending)
    		System.out.println("Please Wait");
    	else
    		System.out.println("Done");
    	
    }
}