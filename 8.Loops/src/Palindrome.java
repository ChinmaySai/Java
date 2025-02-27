import java.util.Scanner;

public class Palindrome {
public static void main(String[] args)
{
    Scanner scan=new Scanner(System.in);

    System.out.println("Enter a Number");
    int n=scan.nextInt();
    int rev=0;
    int temp=n;
    int count=0;
    while(n>0)
    {
    rev=rev*10+n%10;
     n=n/10;
    }
    if(rev==temp)
    {
    System.out.println("Palindrome Number");	
    }
    else
    {
    	System.out.println("Not a Palindrome");
    }
    
    
 }	

}
