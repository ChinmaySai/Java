package com.arthimetic;

public class BitWideningNarrowing {

    public static void main(String[] args) {
        byte b=5;
        short s=120;
        int i=10;
        long l=10;
        float f=10.5f;
        double d=10;
        char c=10;
        boolean bl=true;
        
        b=(byte)s;  //Explict type casting
        System.out.println("Byte value after Explicit casting from short to Byte : "+b);
        i=s;//int=short
        l=s;//long=short
        f=s;//float=short
        d=s;//double=short
        
        i=(int)f;
        System.out.println("int value after Explicit casting from float to int : "+i);
    }
    
}