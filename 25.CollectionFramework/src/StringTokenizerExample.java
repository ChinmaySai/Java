

import java.util.*;
import java.io.*;

public class StringTokenizerExample {

    public static void main(String[] args) throws Exception
    {

        String data="name=Vijay address=delhi country=india dept=cse";
    
        
        StringTokenizer stk=new StringTokenizer(data,",");
        
        String s;
        ArrayList<String> al=new ArrayList<>();
        
        while(stk.hasMoreTokens())
        {
            s=stk.nextToken();
            al.add(s);
            
        }
        
        System.out.println(al);
        String data1="name=Vijay address=delhi country=india dept=cse";

        StringTokenizer stk1=new StringTokenizer(data1," ");
        
        String s1;
        ArrayList<String> al1=new ArrayList<>();
        
        while(stk1.hasMoreTokens())
        {
            s1=stk1.nextToken();
            al1.add(s1);
            
        }
        
        System.out.println(al1);


    }
    
}