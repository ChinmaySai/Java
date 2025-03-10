package com.chinmay.methodoverload;

public class ReverseMethodOverload {
	static int [] reverse(int A[])
    {
        int B[]=new int[A.length];
        
        for(int i=A.length-1,j=0;i>=0;i--,j++)
            B[j]=A[i];
        
        return B;
    }
	static int reverse(int n)
    {
        int rev=0;
        
        while(n>0)
        {
            rev=rev*10+n%10;
            n=n/10;
        }
        return rev;
    }

    public static void main(String[] args) 
    {
        System.out.println("Reverse of 5254 ->"+reverse(5254));
        int a[]=new int[5];
        for(int i=0;i<5;i++)
        {
        	a[i]=(i+1)*16;
        }
        for(int val:a)
        {
        	System.out.print(val+" ");
        }
        System.out.println();
        a=reverse(a);
        for(int val:a)
        {
        	System.out.print(val+" ");
        }
        
    } 

}
