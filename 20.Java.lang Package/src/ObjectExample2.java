class MyObject 

{ 

public String toString() 

{ 

return "MyObject "; 

 

} 

@Override 

public int hashCode() 

{ 

return 100; 

} 

public boolean equals(Object o) 

{ 

 

return this.hashCode()==o.hashCode(); 

} 

} 

public class ObjectExample2 { 

  

public static void main(String[] args) { 

  

MyObject o1=new MyObject(); 

MyObject o2=new MyObject(); 

System.out.println(o1.equals(o2)); 

} 

  

} 

 