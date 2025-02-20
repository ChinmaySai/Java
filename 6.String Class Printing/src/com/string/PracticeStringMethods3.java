package com.string;

import java.sql.SQLOutput;

public class PracticeStringMethods3 {
    public static void main(String[] args) {

        String str="Chinmay";
        String str1="Chinmay";
        String str2="chinmay";
        String str3=new String("Chinmay");
        System.out.println("str ->"+str);
        System.out.println("str1 ->"+str1);
        System.out.println("str.equals(str1) -> "+str.equals(str1));
        System.out.println("str.equals(str2) -> "+str.equals(str2));
        System.out.println("str.equalsIgnoreCase(str2) -> "+str.equalsIgnoreCase(str2));
        //Comparing the Objects
        System.out.println("str==str1 "+(str==str));
        System.out.println("str==str1 "+(str1==str2));
        System.out.println("str==str3 "+(str==str3));
         /**
        compareTo() compares the Ascii values
        Consider two Strings s1 and s2
        if s1>s2 then Positive value
        else if s1<s2 then Negative value
          else
          o
          **/
        System.out.println("str.compareTo(str2) "+(str.compareTo(str2)));
        System.out.println("str.compareTo(str1) "+(str2.compareTo(str)));
        System.out.println("str.compareTo(str3) "+(str.compareTo(str3)));

        System.out.println("str2.compareToIgnoreCase(str3) "+(str2.compareToIgnoreCase(str3)));


        System.out.println("str2.contains("+"\"may\""+") "+(str2.contains("may")));
        String str4="Sai";
        System.out.println("str.concat(\"str4\") "+(str.concat(str4)));

        System.out.println("str+str4 "+(str+str4));


        //Converting other data types to String
        String str5=String.valueOf(10);
        System.out.println("str5 : "+str5);


    }

}
