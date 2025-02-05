package com.arthimetic;


import java.util.*;


public class Area_Of_traingle 
{
    public static void main(String[] args) 
    {
        float base,height,area;
        System.out.println("Enter Base and Height of the traingle");
        Scanner sc=new Scanner(System.in);
        base=sc.nextFloat();
        height=sc.nextFloat();
        area=base*height*0.5f;
        System.out.println("Area of Triangle is "+area);
    }
    
    
   
}