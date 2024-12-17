 

import java.lang.*; 

public class LangDemo { 

  

public static void main(String[] args) { 

  

Object o1=new Object(); 

System.out.println(o1); 

Object o2=new Object(); 

System.out.println(o1.equals(o2));//equals method checks whether both o1  //and o2 are referring to the same Object/not 
 Object o3=o1; 

System.out.println(o1.equals(o3));//true -- As both the o1 and o3 are 						//referring to same Object 

 

System.out.println(o1.hashCode()); 



 

} 

  

} 