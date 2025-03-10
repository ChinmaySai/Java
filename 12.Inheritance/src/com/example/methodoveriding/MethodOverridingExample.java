package com.example.methodoveriding;


class Super
{
    public void display()
    {
        System.out.println("Super Display");
    }
}

class Sub extends Super
{
    public void display()
    {
        System.out.println("Sub Display");
    }
}

public class MethodOverridingExample
{
    public static void main(String[] args) 
    {
        Super s=new Sub();
        s.display();
          
    }    
}
