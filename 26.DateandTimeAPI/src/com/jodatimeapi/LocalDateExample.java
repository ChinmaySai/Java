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
       
       LocalDate d4=LocalDate.of(2020,5,10);
       System.out.println(d4);
       
       LocalDate d5=LocalDate.ofEpochDay(1000);
       System.out.println("EPoch Date for 1000 days : "+d5);
       
       LocalDate d6=LocalDate.parse("2020-01-03");
       System.out.println(d6);
       
       LocalDate d7=d6.plusMonths(5);
       System.out.println("Date after adding Months: "+d7);
           
       
	}

}
