package com.syntax.reviewclass08;

import javax.print.Doc;
import java.sql.SQLOutput;

public class Doctor {
    //this. refers to current class instance variables, current class, method;
    //this() refers to current class default constructor, this(Str name,int age.. etc.) refers to current class constructor with parameters
    public String firstName, lastName;// VARIABLES (in our case instance) MUST have returnType(data type) and MUST have name;--->
    protected String speciality;     // they can have access modifiers( OPTIONAL)-->they can have non access modifiers(OPTIONAL)
    int experience;
    private double salary;
    static String hospital = "UCFS";//<---should be accessed in static way, Class name plus static variable name--->Doctor.hospital;

    public Doctor(String firstName, String lastName) {//as soon we create constructor Java will use it and won't create default constructor for us
        this.firstName = firstName;                   // constructor initializes variables when creating an object
        this.lastName = lastName;
    }
    //In order to have many Constructors we need to have different number parameters, data types and  sequence of it;
    //Doctor(String firstName,String lastName){}<--- cant have duplicate constructors( same parameters)

    Doctor(String firstName, String lastName, String speciality, int experience) {
        this(firstName, lastName);//<---this() calls default constructor, this(firstName,lastName) calls previous or current class constructor and when we call it has to be first line in a constructor;
        this.speciality = speciality;//<--- this. referring instance of Doctor class to local variable in a constructor
        this.experience = experience;

    }

    public void printInfo() { //METHODS MUST have return Type(data type) and name(){logic} -> it can be void and can be with return-->
        // they both can have or dont have parameters(argument)--->methods can have access modifiers( OPTIONAL)-->methods can have non access modifiers(OPTIONAL)
        System.out.println(firstName + " " + lastName + " and his speciality is " + speciality);
    }

    protected void work() {
        System.out.println("Doctor " + lastName + " works at " + hospital);
    }

    void treat(String patientName) {
        this.printInfo();// we can add current class method inside to  another method by using this.( if we don't do it Compiler does it for us)
        System.out.println("Dotor " + lastName + " treats patient " + patientName);
    }

    /* static void study(String university{// in order to use static method we must use STATIC members, variable or method( variable lastName and method printInfo()in our case must be static)
         printInfo()
         System.out.println("Doctor "+lastName+" studied at "+university);
     }
     */
     public static void study(String university) {
        System.out.println("Doctor studied at " + university + " and works in hospital " + hospital);
    }

    private void getPaid() {
        System.out.println("Doctor " + lastName + " gets paid " + salary);
    }
}
/*
ACCESS MODIFIERS
From most to less restrictive: Private--->Default--->Protected--->Public
Private - can be accessed only inside a class it was applied;
Default - can be accessed any classes within the same package;
Protected - can be accessed any classes within the same package, BUT available in different packages when inheritance is involved;
Public - can be accessed anywhere within the same project.
 */

class Hospital {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("John", "Smith");
        doctor.printInfo();
        Doctor.hospital = "Mayo Clinic";//<---- if we change static variable it will be changed for everyone
        doctor.work();
        Doctor doctor1 = new Doctor("Joe", "Doe", "cardialogist", 10);
        doctor1.printInfo();
        doctor1.work();
        doctor1.treat("Samantha");
        doctor1.study("Princeton");

    }
}

class Hospital2 {
    public static void main(String[] args) {
        Doctor doc = new Doctor("Sherlock", "Holmes", "Magic", 10);
        //access methods to test visibility
        doc.printInfo();//access to public
        doc.treat("Samantha");// access to default
        doc.work();//access to protected
        Doctor.study("Princeton");//access to public static
    }
}