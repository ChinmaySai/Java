package com.swith;

import java.util.*;

public class DomainNameWithSwitch 
{
    public static void main(String[] args) 
    {
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Enter Domain name");
        String domain=scan.nextLine();
        
        String extension=domain.substring(domain.lastIndexOf(".")+1);
        
        System.out.println(extension);
        switch(extension)
        {
            case "com": System.out.println("Commercial");
                        break;
            case "org": System.out.println("Organisation");
                        break;
            case "gov": System.out.println("Government");
                        break;
            case "net": System.out.println("Network");
                        break;
        }
    }
        
        
    }