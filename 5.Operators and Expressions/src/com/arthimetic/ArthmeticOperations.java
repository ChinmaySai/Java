package com.arthimetic;

public class ArthmeticOperations {

    public static void main(String[] args) {
        
        int num1=11,num2=6;
        
        int div=num1/num2;
        int rem=num1%num2;
        
        System.out.println("Integer Divsion "+div);
        System.out.println("Integer remainder "+rem);
        
        
        
        float f1=14.3f,f2=3.2f;
         
        float fdiv=f1/f2;
        float frem=f1%f2;
        System.out.println("Float Divsion "+fdiv);
        System.out.println("Float remainder "+frem);
        
        
        byte b1=10;
        short s1=15;
        int i1=b1+s1;
        System.out.println("(byte+short) "+i1);
        
        float a=12.5f;
        long b=1231;
        float c=a*b;
        System.out.println("(float*long) "+c);

        
        float f3=12.5f;
        double d1=123;
        double dmul=f2*d1;
        System.out.println("(float*double) "+dmul);

        
        char ch=97;
        int ch1=65;
        int chsub=ch-ch1;
        System.out.println("Character Sub "+chsub);
        
        }
    
}