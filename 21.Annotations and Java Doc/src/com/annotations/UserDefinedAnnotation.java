package com.annotations;


@interface MyAnno
{
	String name();
	String project();
	String date() default "13/12/2024";
}

@MyAnno(name="Chinmay",project="Bank")
public class UserDefinedAnnotation {

	int val;
	//@MyAnno(name="Chinmay")
	public static void main( String[] args) {

//		@MyAnno(name="Chinmay")
		int a=10;
		System.out.println("Inside the User annotation main method");
	}
}
