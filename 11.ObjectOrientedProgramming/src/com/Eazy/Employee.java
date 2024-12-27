package com.Eazy;

public class Employee {

    String firstName;
    String lastName;
    byte age;
    char gender;
    static final String EMPLOYER_NAME = "Google";

    public Employee() {
        this("George","Sai", (byte)26, 'M');//Making call to parametrized Constriuctor
        System.out.println("Object is getting created in Default Constructor.");
    }

    public Employee(String firstName, String lastName, byte age, char gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        System.out.println("Object is getting created in overloaded Constructor.");
    }

    public byte getAge( ) {
        return age;
    }

    public char getGender( ) {
        return gender;
    }

}