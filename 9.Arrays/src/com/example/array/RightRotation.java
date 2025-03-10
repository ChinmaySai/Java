package com.example.array;

/**
 * Java Program for Right Rotation of Array
 */
public class RightRotation {

	public static void main(String[] args) {

		System.out.print("Intial Array : ");

		int arr[]=new int[10];
		for(int i=1;i<=10;i++)
		{
			arr[i-1]=i;
			System.out.print(arr[i-1]+" ");
		}
		int temp=arr[arr.length-1];
		
		for(int j=arr.length-1;j>0;j--)
		{
			arr[j]=arr[j-1];
		}
		arr[0]=temp;
		System.out.print("\nRightRotation : ");
		for(int i=0;i<arr.length;i++)
		System.out.print(arr[i]+" ");
	}

}
