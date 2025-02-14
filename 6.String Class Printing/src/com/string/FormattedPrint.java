package com.string;

public class FormattedPrint {

    public static void main(String[] args) {
        int x=96;
        float y=999.56f;
        char z='E';
        String str="Chinmay Sai";
          
        System.out.printf("%3$s %2$f %1$d",x,y,str);
        System.out.println();
        System.out.printf("x = %d y = %f z = %c str = %s\n",x,y,z,str);
        //%o,%x,%e for float value
        
    }
    
}