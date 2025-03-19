package com.example.singleton;


class CoffeeMachine
{
    private float coffeQty;
    private float milkQty;
    private float waterQty;
    private float sugarQty;
    
    static private CoffeeMachine st=null;
    
    private CoffeeMachine()
    {
        coffeQty=1;
        milkQty=1;
        waterQty=1;
        sugarQty=1;
    }
    
    public void fillWater(float qty)
    {
        waterQty=qty;
    }
    public void fillSugar(float qty)
    {
        sugarQty=qty;
    }
    public float getCoffee()
    {
        return 0.15f;
    }
    
    static CoffeeMachine getInstance()
    {
        if(st==null)
            st=new CoffeeMachine();   //if st is null then Only create a new Object
        return st;
    }

	@Override
	public String toString() {
		return "CoffeeMachine [coffeQty=" + coffeQty + ", milkQty=" + milkQty + ", waterQty=" + waterQty + ", sugarQty="
				+ sugarQty + "]";
	}
    
    
            
}
public class Singleton 
{
    public static void main(String[] args) 
    {
        CoffeeMachine m1=CoffeeMachine.getInstance();
        CoffeeMachine m2=CoffeeMachine.getInstance();
        CoffeeMachine m3=CoffeeMachine.getInstance();
        
        System.out.println(m1+"\n"+m2+"\n"+m3);
        if(m1==m2 && m1==m3)
            System.out.println("Same");
        
    }   
}