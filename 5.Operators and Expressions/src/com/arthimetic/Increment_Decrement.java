package com.arthimetic;

public class Increment_Decrement {

    public static void main(String[] args) {
        
        float f=9.2f;
        byte b1=5;
        char ch='A';
        
        int incr=21;
        incr++; 
        System.out.println(incr);
        
        int incr1=21,res;
        res=incr1++; //++x
        System.out.println(incr1+" "+res);
        
        int incr2=21,res1;
        res1=++incr2; //++x
        System.out.println(incr2+" "+res1);
        
        int num1=5,num2=4,num3;
        num3=2 * num1++ + 3 * ++num2;
        System.out.println(num3);
    }
    
}