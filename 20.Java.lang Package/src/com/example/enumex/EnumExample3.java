package com.example.enumex;
enum Status //Status here is a class
{
Running,Failed,Success,Pending;//All these are Objects of Status Class --Every Named Constant will have a number associated to it.
}
public class EnumExample3
{
public static void main(String args[])
{
Status s1=Status.Running;
System.out.println(s1);
System.out.println(s1.ordinal());//Returns Order of the Named Constant --In this case it is 0 for Running
Status s[]=Status.values();//Returns all the Statues
for(Status ss:s)
{
System.out.println(ss+" "+ss.ordinal());
}
}
}