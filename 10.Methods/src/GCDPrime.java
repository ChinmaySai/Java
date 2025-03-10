

public class GCDPrime 
{
    
     int gcd(int m,int n)
    {
        while(m!=n)
        {
            if(m>n)m=m-n;
            else n=n-m;
        }
        return m;
    }
            
    public static void main(String[] args) 
    {
        GCDPrime x=new GCDPrime();
        System.out.println("GCD of 35,56 : "+x.gcd(35,56));
        
        if(isPrime(23))
        {
        	System.out.println("23 is a Prime Number");
        }
        else
        {
        	System.out.println("Not Prime");
        }
        
        
        
    } 
        
        
    static boolean isPrime(int n)
    {
        for(int i=2;i<n/2;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
        
    }

}