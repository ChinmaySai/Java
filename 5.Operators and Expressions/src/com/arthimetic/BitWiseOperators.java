package com.arthimetic;

public class BitWiseOperators {

	    public static void main(String[] args) {
	        
	    	//Logical And
	        int x=10, y=6,z;
	        z=x&y;
	        System.out.println(z);
	        
	        
	        //Logical OR
	        int b1=0b1010,b2=0b0110,binorres;
	        binorres=b1*b2;  //x^y
	        System.out.println(z);
	        
	        
	        //Shift Operations
	        int bina=0b1000;
	        int binbsh;
	        binbsh=bina<<1;
	        System.out.println(binbsh);
	        
	        
	        
             int nu4=-0b1010; //try with + and -
	        int num4=0;
	        num4=x>>1; //~x
	        System.out.println(String.format("%s",Integer.toBinaryString(x)));
	        System.out.println(String.format("%s",Integer.toBinaryString(y)));
	    }
	    
	

}
