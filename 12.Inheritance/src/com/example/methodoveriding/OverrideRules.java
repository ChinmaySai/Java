package com.example.methodoveriding;



class NewSuper
{
    private void display()//or even protected may not give any error.
    {
        System.out.println("Super display.");
        
    }
}

class NewSub extends NewSuper    
{
    //@Override if public
    public void display()
    {
        System.out.println("Sub diaplay.");
        
    }
}

public class OverrideRules {

    public static void main(String[] args) {
        
        NewSub s=new NewSub();
        s.display();
        
    }
    
}