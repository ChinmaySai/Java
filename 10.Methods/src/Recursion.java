/**
 * Recursion:
 * A recursive method is the one which will	call itself.	
 */
public class Recursion 
{
    static void fun(int n)
    {
        if(n>0)
        {
            fun(n-1);

            System.out.println(n);
        }
    }

    public static void main(String[] args) 
    {
        fun(3);
    }
}