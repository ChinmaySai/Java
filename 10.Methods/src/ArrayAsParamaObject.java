

public class ArrayAsParamaObject {

    static void change(int A[],int index,int value)
    {
        A[index]=value;
    }
    
    static void change2(int x,int value)
    {
        x=value;
    }
    
    public static void main(String[] args) {
    	
    	System.out.print("Intial Array ");
        int A[]={2,4,6,8,10};
        for(int x:A)
        	System.out.print(x+" ");
        change(A,2,20);
       System.out.println();
        for(int x:A)
        {
            System.out.print(x+" ");
        }
        
        int x=10;
        
        change2(x,20);
        
        System.out.println("\nValue of primitive"+x);
    }
    
}