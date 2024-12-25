package com.ObjectOriented;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudentMain {

	public static void main(String[] args) throws IOException {

		StudentTest st=new StudentTest();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Please provide the Roll no :");
		st.rollNo=br.readLine();
		System.out.print("Please provide the Name :");
		st.name=br.readLine();
        System.out.print("Branch Name :");
        st.branch=br.readLine();
        System.out.print("First Subject Marks :");
		st.m1=Integer.parseInt(br.readLine());
		System.out.print("Second Subject Marks :");
		st.m2=Integer.parseInt(br.readLine());
		System.out.print("Third Subject Marks :");
		st.m3=Integer.parseInt(br.readLine());
		
		System.out.println("Name : "+st.name);
		System.out.println("Roll No : "+st.rollNo);
		System.out.println("Branch Name :"+st.branch);
		System.out.println("Total Marks of "+st.name+" is "+st.total());
		System.out.println("Grade :"+st.grade());
	}

}
