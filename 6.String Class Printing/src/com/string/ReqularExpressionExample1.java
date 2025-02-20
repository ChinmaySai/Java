package com.string;

public class ReqularExpressionExample1 {

    public static void main(String[] args) {
        
    	
        String str1="a";
        System.out.println("str1.matches("+"\".\") - >"+str1.matches("."));//String Should be of only Single character
        
        String str2="a";//b,c
        System.out.println("str2.matches("+"\"[abc]\""+")"+str2.matches("[abc]"));//Any Character of a/b/c
        
        String str3="p";//true for alphabets other than abc
        System.out.println("str3 "+str3.matches("[^abc]"));
        
        String str4="7";
        System.out.println("str4 "+str4.matches("[a-zA-Z0-9]"));//Any One String of Length 1 from a-z or A-Z or 1-9
        String str7="A";
        String str8="a";
        String str5="b";
        System.out.println("str7 "+str7.matches("[a-zA-Z0-9]"));
        System.out.println("str8 "+str8.matches("[a-zA-Z0-9]"));
        System.out.println("str5 "+str5.matches("[a-zA-Z0-9]"));
        String str9="a5";
        System.out.println("str9 "+str9.matches("[a-z][0-9]"));
        System.out.println("str1 "+str1.matches("a|b"));//Either a or b 
        
        String str6="@";
        System.out.println("str6 - >"+str6.matches("\\w")); //Either Alphabet/Digit/Underscore
        String str16="9";
        System.out.println("str16 "+str16.matches("\\w"));
        
        String str10="5";
        System.out.println("str10 "+str10.matches("\\d"));    //String Should be Digit
        
        String str11="$";
        System.out.println("str11 "+str11.matches("\\D"));       //String should not be either Number/Digit/underscore 
    }
    
}