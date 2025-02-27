/**
 * 
 * Java Program to count the Digits in the number
 */

import java.util.Scanner;

public class CountOfDigits
{
    public static void main(String[] args)
    {
       Scanner scan=new Scanner(System.in);

       System.out.println("Enter a Number");
       int n=scan.nextInt();
       int temp=n;
       int count=0;
       while(n>0)
       {
        n=n/10;
        count++;
       }
       
        System.out.println("Number of Digits in "+temp+"-> "+count);
    }
    }