package com.string;

public class ReqularExpressionsExample2 {
	
	public static void main(String args[])
	{
		String str1="abcdef";
		
		System.out.println(str1.matches(".*"));
		System.out.println(str1.matches("[a-z]*"));
		String str2="ab2cde";
		System.out.println(str2.matches("[a-z]*"));
		String str3="abBde";
		System.out.println(str2.matches("[a-z]*"));
	     str3="abcba";
	    System.out.println(str3.matches("[abc]*")); //0 or More
	    System.out.println(str3.matches("[abc]*")); // 1 or More
	    str3="abc";
	    System.out.println(str3.matches("[abc]{3}")); //Letter must be either a or b or c but must be of 3 letters.
	     str3="ab";
	    System.out.println(str3.matches("[abc]{3}")); //Letter must be either a or b or c but must be of 3 letters.
        str3="acbb";
	    System.out.println(str3.matches("[abc]{3,7}")); //Letter must be either a or b or c with the length from 3 to 7.
	    
	    String email="George@gmail.com";
	    System.out.println(email.matches("\\w*@gmail.com"));
	     //System.out.println(email.indexOf("@gmail"));

	    
	    
	    
		

	}

}
