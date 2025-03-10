package com.chinmay.variablenumberofarguments;

public class SumofArrayVariableArgumnets {
	 static int sum(int ...A)
	    {
	        int s=0;
	        for(int i=0;i<A.length;i++)
	            s+=A[i];
	        
	        return s;
	    }
	    
	    static double sum(double ...P)
	    {
	        double sum=0;
	        
	        for(int i=0;i<P.length;i++)
	            sum+=P[i];
			return sum;
}
	    public static void main(String[] args) {
			System.out.println("SumofArrayVariableArgumnets");
		}
}
