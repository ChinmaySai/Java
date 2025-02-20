package com.string;

public class StringChallenge {
	
	public static void main(String args[])
	{
		String str="Programmer@gmail.com";
		int index=str.indexOf("@");
		String username=str.substring(0,index);
		System.out.println("User Name :"+username);
		String domainname=str.substring(index+1);
		System.out.println("domainname "+domainname);
		
	}

}
