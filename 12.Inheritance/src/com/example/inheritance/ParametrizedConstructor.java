package com.example.inheritance;

class ParentNew
{
    ParentNew()
    {
        System.out.println("Non-Param of parent");
    }
    ParentNew(int x)
    {
        System.out.println("Param of parent "+x);
    }
}

class ChildNew extends ParentNew
{
	ChildNew()
    {
        System.out.println("Non-Param of child");
    }
	ChildNew(int y)
    {
        System.out.println("Param of child");
    }
	ChildNew(int x,int y)
    {
        super(x);
        System.out.println("2 param of child "+y);
    }
}

public class ParametrizedConstructor {

    public static void main(String[] args) {
    	ChildNew c1=new ChildNew();
    	ChildNew c2=new ChildNew(20);
    	ChildNew c=new ChildNew(10,20);
    }
    
}
