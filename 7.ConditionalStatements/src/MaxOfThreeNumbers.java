
public class MaxOfThreeNumbers 
{
    public static void main(String[] args) 
    {
        int a=50,b=15,c=422;
        
        if(a>b && a>c)
        {
            System.out.println("Max of "+a+","+b+","+c+" is "+a);
        }
        else if(b>c)
        {
        	System.out.println("Max of "+a+","+b+","+c+" is "+b);
        }
        else
        {
        	System.out.println("Max of "+a+","+b+","+c+" is "+c);
        }
        
    }   
}