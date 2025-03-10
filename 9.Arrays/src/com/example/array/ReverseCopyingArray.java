package com.example.array;

public class ReverseCopyingArray {

	public static void main(String[] args) {

		int a[]= {2,4,6,8,10,12,54};
		int b[]=new int[a.length];
		for(int i=0,j=a.length-1;i<a.length&&j>=0;i++,j--)
		{
			b[j]=a[i];
		}
		System.out.print("Reverse Copying of Array ");
		for(int x:b)
		{
			System.out.print(x+" ");
		}
	
	}

}
