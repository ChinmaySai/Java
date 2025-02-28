package com.example.array;

import java.util.Scanner;

public class SearchingForKey {
public static void main(String args[])
{
	System.out.println("Enter a Key " );
	Scanner sc=new Scanner(System.in);
    int key=sc.nextInt();
    int A[]={3,9,7,8,12,6,15,5,4,10};
    
    for(int i=0;i<A.length;i++)
    {
        if(key==A[i])
        {
            System.out.println("Element Found at :"+i);
            System.exit(0);;
        }
    }
    System.out.println("Not found");
}
}
