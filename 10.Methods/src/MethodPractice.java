


public class MethodPractice {
    
    static int max(int x,int y)
    {
        if(x>y)
            return x;
        else 
            return y;
    }
    
    static void inc(int x)
    {
        x++;
        System.out.println(x);
    }
    
    public static void main(String[] args) {
    
        int a=10,b=15;
        System.out.println("Maximum of 10  and 15 "+max(a,b));
        
        MethodPractice mp=new MethodPractice();
        System.out.println("Maximum of 10  and 15 "+mp.max(a,b));
        
        int a1=10,b1=15;
        inc(a1);
        System.out.println(a1);
        
        
    }
    }
    