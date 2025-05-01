package com.example.finallyblock;

public class FinallyExample 
{
    static void meth1()throws Exception
    {
        try
        {
            
        throw new Exception();
        }
        finally
        {
        System.out.println("Finally Block Message");
        }
        
    }
    
    public static void main(String[] args)throws Exception
    {
    	try
    	{
        meth1();
    	}
//    	catch(Exception e)
//    	{
//    		e.printStackTrace();
//    	}
	finally
    	{
    		System.out.println("Finally Main Method");
    	}
    }   
}