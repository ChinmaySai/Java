package com.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//@Retention(RetentionPolicy.CLASS)
//@Documented
@Target(value= {ElementType.METHOD,ElementType.LOCAL_VARIABLE})
@interface MyAnno1
{
	String name();
	String project();
	String date() default "13/12/2024";
}

public class BuiltinAnnotations {

	int val;
	@MyAnno1(name="Chinmay",project="Bank")
	public static void main( String[] args) {

		@MyAnno1(name="Chinmay",project="Bank")
		int a=10;
		System.out.println("Inside the User annotation main method");
	}
}
