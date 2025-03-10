package com.example.array;

public class CopyingArray {

	public static void main(String[] args) {

		int a[]=new int[10];
		int b[]=new int[10];
		for(int i=0;i<10;i++)
		{
			a[i]=i*5;
			
		}
		for(int i=0;i<10;i++)
		{
			b[i]=a[i];
			
		}
		for(int x:b)
		{
			System.out.print(x+" ");
		}
		
	}

}
