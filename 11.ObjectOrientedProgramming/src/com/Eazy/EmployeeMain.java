package com.Eazy;


public class EmployeeMain {

    public static void main(String[] args) {

        /*Employee employee1 = new Employee();
        Employee employee2 = new Employee();*/

        Employee employee1 = new Employee("Chinmay", "Sai", (byte) 25, 'M');
        Employee employee3 = new Employee();

        /*employee.firstName = "Chinmay";
        employee.lastName = "Sai";
        employee.age = 25;
        employee.gender = 'M';*/

        System.out.println(employee1.getAge());
        System.out.println(employee1.getGender());

        System.out.println(employee3.getAge());
        System.out.println(employee3.getGender());
        System.out.println("First Name "+employee3.firstName);
        System.out.println(employee3.lastName);

        System.out.println(Employee.EMPLOYER_NAME);
    }
}	