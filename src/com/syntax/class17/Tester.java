package com.syntax.class17;

public class Tester {
    public static void main(String[] args) {
        Employee employee=new Employee();

        employee.name="Mike";
        //employee.salary=125000;<---we cant access this variable even the Employee class is public but salary variable is private
        employee.department="IT Destroyer";// <--- its default so can be accessed through the same package
        //employee.printsalary();<----again, method is private, not accessible
        //Import is only about classes, it doesn't matter fields or methods are public or static - we can import only classes.
        employee.printManager();//<----can be accessed just by writing the name of the class without creating the object

    }
}
