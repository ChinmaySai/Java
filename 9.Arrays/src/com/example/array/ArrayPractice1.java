package com.example.array;

public class ArrayPractice1 {

    public static void main(String[] args) {
        int A[]=new int[10];
        int B[]={1,2,3,4,5};
        
        int C[];
        C=new int[10];
        
        B[2]=15;
        
        //By Default Object will be initialized with default values
       // For int -->0
        //For String --> null
        for(int i=0;i<A.length;i++)
        {
            System.out.print("A["+i+"]"+A[i]+"\n");
        }
        
        System.out.println();
        for(int i=0;i<B.length;i++)
        {
            System.out.println("B["+i+"] "+B[i]);
        }
        
        
        for(int x:B)
        {
            System.out.println(x++);
        }
        for(int x:B)
        {
            System.out.println(x);
        }
        
        
        for(int i=0;i<B.length;i++)
        {
            System.out.print("B["+i+"]++  -> "+B[i]+++"\n");
        }
        
        
        System.out.println("B.length "+B.length);
    }
    
}