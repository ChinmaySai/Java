package com.string;

public class StringChallenge3 {

	public static void main(String args[])
	{
		//Remove special Characters from String
		String str1="a!b@c#1#2%3";
		
		 String str3=str1.replaceAll("[^a-zA-Z0-9]", "");
		 System.out.println("String Without any specail Characters "+str3);
	      
		 //Remove Extra Spaces
		String str2="abc  def  ghi";
		String str4=str2.replaceAll("\\s+", " ");		
		System.out.println("str4 "+str4);
		
		
		//Find the Number of Words in String
		String str5="Chinmay Sai";
		String str6[]=str5.split("\\s+");
		
		for(int i=0;i<str6.length;i++)
		{
		System.out.print("str6["+i+"]"+str6[i]+"\n");
		}		
		 System.out.println("Number of Words : "+str6.length);
	
	}
}
