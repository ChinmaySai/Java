package com.string;
import java.io.*;

public class PracticeStringMethods2
{
    public static void main(String[] args) {

        String str="Chinmay Sai";
        System.out.println("String Starting with Chinmay ? "+str.startsWith("Chinmay"));
        System.out.println("String Starting with chinmay ? "+str.startsWith("chinmay"));
        System.out.println("String Starting with may from 4 index ? "+str.startsWith("may",4));
        System.out.println("String Starting with sai ? "+str.endsWith("sai"));
        System.out.println("String Starting with Sai ? "+str.endsWith("Sai"));
        System.out.println("Characheter at index 5 is "+str.charAt(5));
        for (int i=0;i<str.length();i++)
        {
            System.out.println ("Character at index -> "+i+" is "+str.charAt(i));
        }
        System.out.println("Index of Character C is "+str.indexOf('C'));
        System.out.println("Index of Character i is "+str.indexOf('i'));
        System.out.println("Index of Character i from 1 "+str.indexOf('i'));
        System.out.println("Index of Character i from last "+str.lastIndexOf('i'));
        System.out.println("Index of String Chinmay is "+str.indexOf("Chinmay"));

    }
}