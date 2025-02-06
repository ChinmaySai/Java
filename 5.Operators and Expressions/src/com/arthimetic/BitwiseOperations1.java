package com.arthimetic;



public class BitwiseOperations1 {

	public static void op()
	{      int a=10, b=15;
      
      a=a^b;
      b=a^b;
      a=a^b;
      
      System.out.println(a+ " "+b);
    }
    
    
    public static void main(String[] args) 
    {
      
      op();
      byte c;
      
      c=(byte)(9<<4);
      c=(byte)(c|12);
      
      System.out.println((c&0b11110000)>>4);
      System.out.println((c&0b00001111)>>4);
      
    }
}