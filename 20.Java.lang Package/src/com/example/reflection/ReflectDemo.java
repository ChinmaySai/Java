package com.example.reflection;

import java.lang.reflect.*;

class My
{
    private int a;
    protected int b;
    public int c;
    int d;
    
    public My() {}
    
    public My(int x,int y) {}
    
    public void display(String s1,String s2) {}
    public int show(int x,int y) {return 0;}
    
}

public class ReflectDemo 
{
    public static void main(String[] args) 
    {
        Class c=My.class;//We can Use Class for getting the definition of class.
                         //For Every class .class file will be generated we are using that and getting 
                         //the Description of the class
        
        My m1=new My();
        Class c1=m1.getClass();
        System.out.println(c.getName()); //Returns Class Name
        System.out.println("\nFields");
        Field field[]=c.getDeclaredFields();
        for(Field f:field)
        {
        	System.out.println(f);
        }
        System.out.println("\nConstructor");
        Constructor con[]=c.getConstructors();
        for(Constructor co:con)
        {
        	System.out.println(co);
        }
        System.out.println("\nMethods");
        Method meth[]=c.getMethods();
        
        for(Method m:meth)
            System.out.println(m);
        
        System.out.println("\nParameters");
        Parameter param[]=meth[0].getParameters();
        
        for(Parameter p:param)
        {
            System.out.println(p);
        }
        
    }   
}