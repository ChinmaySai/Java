package com.example.list;
import java.util.*;

public class ArrayListExample {

    public static void main(String[] args) {
        
        ArrayList<Integer> al1=new ArrayList<>(20);
        
        ArrayList<Integer> al2=new ArrayList<>(List.of(50,60,70,80,90));
        
        al1.add(10);
        al1.add(0,5);
        //al1.addAll(al2);
        al1.addAll(1,al2);
        al1.add(5,70);
        al1.set(6,100);
        al1.remove("100");//Remove Object 100 from the List
        al.remove(0);//Remove 0th index element from the List
        al1.forEach(n->System.out.print(n));
        System.out.println();
        al1.forEach(System.out::print);
        System.out.println();
        al1.forEach(n->show(n));
        
        System.out.println("al1.contains(25) "+al1.contains(25));
        System.out.println("al1.get(5) "+al1.get(5));
        System.out.println("al1.indexOf(70) "+al1.indexOf(70));
        System.out.println("al1.lastIndexOf(70)"+al1.lastIndexOf(70));
        
        System.out.println("al1"+al1);
        
        for(int i=0;i<al1.size();i++)
            System.out.println("al.get("+i+") "+al1.get(i));
        /*
        for(Integer x:al1)
            System.out.println(x);
        
        for(Iterator<Integer> it= al1.iterator(); it.hasNext();)
        {
            java.lang.Integer x = it.next();
            System.out.println(x);
        }
        
        al1.forEach((x)->{
            System.out.println(x);
        });
        
        for(Iterator<Integer> it=al1.listIterator();it.hasNext();)
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        
        */
    }
    
    static void show(int n)
    {
        if(n>60)
            System.out.println(n);
    }
    
}
