package com.arthimetic;

import java.util.Scanner;

public class Cuboid {

    
    public static void main(String[] args) 
    {
        Scanner sc=new  Scanner(System.in);
        int length,breadth,height;
        int totalArea,volume;
        
        System.out.println("Enter length, breadth and height of Cuboid");
        length=sc.nextInt();
        breadth=sc.nextInt();
        height=sc.nextInt();
        
        totalArea=2*(length*breadth+length*height+breadth*height);
        
        volume=length*breadth*height;
        
        System.out.println("Total Area of Cuboid "+totalArea);
        System.out.println("Volume of Cuboid "+volume);
        
        
    }
	
}