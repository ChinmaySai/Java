package com.string;

public class StringCreation {

    public static void main(String[] args) {
        
        
        String str1="Chinmay Sai";//String Literals stored in String Constant Pool
        System.out.println(str1);
        
        //New String Objects stored in Heap Memory
        String str2=new String("GEORGE");
        System.out.println(str2);
        
        char c[]={'H','e','l','l','o'};
        String str3=new String(c);
        String str4=new String(c,1,3);
        System.out.println(str3);
        System.out.println(str4);

        
        byte b[]={65,66,67,68};
        String str5=new String(b);
        String str6=new String(b,1,2);
        System.out.println(str5);
        System.out.println(str6);
        
        
        String scp="Java";
        String scp1="Java";
        String str2Obj=new String("Java");
        System.out.println(scp==scp1);//Will result in true as both these will be pointing to same.
        System.out.println(scp==str2Obj);//Will result in false as scp 
    }
    
}