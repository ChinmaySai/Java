package com.jodatimeapi;
import java.time.*;
import java.util.*;

public class LocalDateExample {

	public static void main(String[] args) {

       Date d=new Date();
       d.setHours(20);
       System.out.println(d); //Date class is Mutable.
       LocalDate ld=LocalDate.now();
       System.out.println("Date : "+ld);
       LocalDate ld1=LocalDate.now(Clock.systemDefaultZone());
       System.out.println("Date : "+ld1);
       LocalDate d2=LocalDate.now(ZoneId.of("Asia/Kolkata"));
       System.out.println(d2);
           
       
	}

}
