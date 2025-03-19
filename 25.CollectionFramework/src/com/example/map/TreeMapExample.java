
package com.example.map;
import java.util.*;
import java.util.Map.*;

public class TreeMapExample 
{ 
    public static void main(String[] args) 
    {    
        HashMap<Integer,String> tm=new HashMap<>(Map.of(0,"A",1,"B",2,"C",3,"D"));
        

        tm.put(4,"E");
        tm.put(5,"F");
        
        
        Set<Integer> st=tm.keySet();
        Collection<String> co =tm.values();
       Iterator itr=st.iterator();
        Iterator itr1=co.iterator();
        while(itr.hasNext())
        {
        	System.out.println(itr.next()+" "+itr1.next());
        }
        System.out.println(tm);
        
    }  
}
