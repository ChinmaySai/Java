package com.chinmay.methodoverload;

/**
 * 
 * Over loaded Method to validate Age and Name
 */
public class OverloadedMethodNameAge {
	    
	    boolean validate(String name)
	    {
	        return name.matches("[a-zA-Z\\s]+");
	    }
	    
	    
	    boolean validate(int age)
	    {
	        return age>=3 && age<=15;
	    }
	    
	   
	    
	    public static void main(String[] args) 
	    {
	    	OverloadedMethodNameAge og=new OverloadedMethodNameAge();
	    	System.out.println(og.validate(12));
	    	System.out.println(og.validate("Chinmay"));
	        
	    } 
	    
	      
	
}

