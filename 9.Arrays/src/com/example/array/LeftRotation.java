package com.example.array;

/**
 * Java Program for Left Rotation of Array
 */
public class LeftRotation {

	public static void main(String[] args) {

		System.out.print("Intial Array : ");

		int arr[]=new int[10];
		for(int i=1;i<=10;i++)
		{
			arr[i-1]=i;
			System.out.print(arr[i-1]+" ");
		}
		int temp=arr[0];
		
		for(int j=0;j<arr.length-1;j++)
		{
			arr[j]=arr[j+1];
		}
		arr[arr.length-1]=temp;
		System.out.print("\nLeftRotation : ");
		for(int i=0;i<arr.length;i++)
		System.out.print(arr[i]+" ");
	}

}
