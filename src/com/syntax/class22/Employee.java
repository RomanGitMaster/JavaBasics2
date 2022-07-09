package com.syntax.class22;

public class Employee {
    String name;
    int baseSalary=30000;
    int baseHolidays=7;

    void calculatePrintSalary(){
        System.out.println(baseSalary);
    }
    void calculatePrintHolidays(){
        System.out.println(baseHolidays);
    }
}
class OfficeBoy extends Employee{

}
class Manager extends Employee{
    @Override// saying we're overriding date from parent class( its like a memo, annotation)
    void calculatePrintSalary(){
        System.out.println(baseSalary*3+20000);
    }
    @Override
    void calculatePrintHolidays(){
        System.out.println(baseHolidays*3);
    }
}
class QA extends Employee{
    @Override
    void calculatePrintSalary(){
        System.out.println(baseSalary*2+20000);
    }
    @Override
    void calculatePrintHolidays(){
        System.out.println(baseHolidays*3+50000);
    }

}

class EmployeeTester{
    public static void main(String[] args) {
        Manager manager=new Manager();
        manager.calculatePrintSalary();
        OfficeBoy officeBoy=new OfficeBoy();
        officeBoy.calculatePrintSalary();// if we not everride the methods in child class we get output same as parent class


    }
}