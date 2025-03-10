package com.example.array;

public class DeletingElement {

	public static void main(String[] args) {
		int arr[]=new int[10];
		System.out.println("Initial Array List");
		for(int i=1;i<=10;i++)
		{
			arr[i-1]=i;
			System.out.print(arr[i-1]+" ");
		}
		int index=1;
		System.out.println("\nArray after deletion of Element at index 1");
		for(int i=index;i<arr.length-1;i++)
		{
			arr[i]=arr[i+1];
		}
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
	}

}
