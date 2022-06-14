package com.syntax.class15class16.class16;

public class GoogleEmployees {

    String name;
    String salary;
   static int noOfEmployees;
   static String companyName="Google";

   void displayEmployeeInfo(){// we cannot put void in System.out.println();

       System.out.println("Name "+name+" Salary "+salary+" Company name "+companyName);
   }

    public static void main(String[] args) {
        GoogleEmployees emp1=new GoogleEmployees();
        emp1.name="Oleg";
        emp1.salary="250000";
        emp1.noOfEmployees=1;
        emp1.displayEmployeeInfo();

        GoogleEmployees emp2=new GoogleEmployees();
        emp2.name="Sameer";
        emp2.salary="250001";
        emp1.noOfEmployees=2;// new reassign value will be updated for everyone since its static variable accessible to all objects
        emp2.displayEmployeeInfo();
    }
}
