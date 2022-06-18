package com.syntax.class15class16.class16;

import com.syntax.class17.Employee;

public class EmployeeTester {

    public static void main(String[] args) {
        Employee emp=new Employee();
        emp.name="Merve";//<--- can be accessed since its public
        //emp.salary=125000;<-----cant be accessed since its private in Package 17 Employee class
        //emp.department="IT Destroyer";<---cant be accessed since its default in Package 17 Employee class, which means
        //can be accessed though the same package only
        Employee.printManager();//<----can be accessed just by writing the name of the class( Employee Class, Package 17)
        // without creating the object
    }






}
