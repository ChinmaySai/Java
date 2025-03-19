package com.example.tryresources;


import java.io.*;
import java.util.*;

public class TryResources 
{
    
    static void divide() throws Exception
    {
        
        
        try(FileInputStream fi=new FileInputStream("/Users/chinmay/Desktop/Test.txt");Scanner sc=new Scanner(fi) )
        {
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println(a/c);
        }
        
    }
    
    public static void main(String[] args) throws Exception
    {
        try
        {
        divide();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        //int x=sc.nextInt();
        
       // System.out.println(x);
        
    }
    
}