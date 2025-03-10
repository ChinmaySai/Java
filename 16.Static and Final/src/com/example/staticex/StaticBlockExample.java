package com.example.staticex;
class TestClass
{
    static
    {
        System.out.println("Block 1");
    }
    
    static
    {
    System.out.println("Block 2");
    }
}

public class StaticBlockExample {

    
    
    static
    {
        System.out.println("Block 1");
    }
    
    
    public static void main(String[] args) 
    {
        System.out.println("Main");
        Test t=new Test();
    }
    
    static
    {
    System.out.println("Block 2");
    }
    
}