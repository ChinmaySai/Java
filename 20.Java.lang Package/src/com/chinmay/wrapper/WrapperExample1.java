package com.chinmay.wrapper; 

  

public class WrapperExample1 { 

  

public static void main(String[] args) { 

  

Integer i=new Integer(10); 

Integer a=Integer.valueOf(10); 

Integer b=10; 

 

Byte c=15; 

Byte d=Byte.valueOf("15"); 

//Byte e=Byte.valueOf(15); //we cannot directly pass number as by default any number will be  

                           //Considered as int. 

//correct Approach 

byte bb=15; 

Byte e=Byte.valueOf(bb); 

Short s=Short.valueOf("123"); 

Float f=12.3f; 

Double d1=Double.valueOf("12.3"); 

Double d2=Double.valueOf(12.3); 

Character ch=Character.valueOf('A'); 

Boolean l=Boolean.valueOf(false); 

 

Float f1=Float.valueOf("12.3"); //Boxing 

float f2=f1.floatValue(); //un-boxing 

float f3=f1; //un-boxing	 

int val=10; 

Integer i1=val; //Auto-Boxing 

int i2=i1;   //Auto-unBoxing 

 

}  

} 

 