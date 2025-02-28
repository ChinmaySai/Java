package com.example.array;

public class SecondLargest {

	public static void main(String[] args) {

		int A[]={3,9,7,8,12,6,15,5,4,10};
		
		for(int i=0;i<A.length;i++)
		{
			for(int j=i+1;j<A.length;j++)
			{
				if(A[i]>A[j])
				{
					int temp=A[i];
					A[i]=A[j];
					A[j]=temp;
				}
			}
		}
//		for(int i:A)
//		System.out.println(i);
		System.out.println("Elements in Sorted Order");
		for(int i=0;i<A.length;i++)
		{
			System.out.println(A[i]);
		}
		System.out.println("Second Largest Element "+A[A.length-2]);
		
		
	
	}

}
