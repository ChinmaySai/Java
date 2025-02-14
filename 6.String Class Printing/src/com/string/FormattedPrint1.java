package com.string;

public class FormattedPrint1 {

    public static void main(String[] args) {
         int a=100000;
         int a1=-10;
        System.out.printf("%05d",a1);//Atleast 5 will be reserved
        
        float f1=123.45f;
        float f2=3.45f;
        System.out.printf("\nFloat :%6.2f",f1);//Minimum of 6 with 2 digits after decimal
        
        String str="Java";
        System.out.printf("\n%20s",str);//Atleast 5 Characters
        
    }
    
}