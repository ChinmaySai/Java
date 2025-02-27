import java.util.Scanner;

public class LeapYearCheck {

	public static void main(String[] args) 
    {
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Enter a Year number");
        int year=scan.nextInt();
        if((year%400==0) || (year%4==0&&year%100==0))
        {
        	System.out.println("Leap Year");
        }
        else
        {
        	System.out.println("Not a Leap Year");
        }
        
}
}
