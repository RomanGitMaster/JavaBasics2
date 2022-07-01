package com.syntax.reviewclass09;

public class Human {
    String name;
    int age;
    double weight;
    String color;

    public Human(String name, int age, double weight, String color){
        this.name=name;
        this.age=age;
        this.weight=weight;
        this.color=color;


    }

    @Override
    public String toString() {// display all info of the class
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }
}
class Employee extends Human{
    String employeeId;
    double salary;
    String title;
    String department;

    public Employee(String name, int age, double weight, String color,String employeeId,String title, double salary,String department) {
        super(name, age, weight, color);
        this.salary=salary;
        this.title=title;
        this.employeeId=employeeId;
        this.department=department;

    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", salary=" + salary +
                ", title='" + title + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
class Sdet extends Employee{
    String programmingLanguage;
    String framework;
    boolean knowsSelenium;

    public Sdet(String name, int age, double weight, String color, String employeeId, String title, double salary, String department,String programmingLanguage,String framework, boolean knowsSelenium) {
        super(name, age, weight, color, employeeId, title, salary, department);
        this.programmingLanguage=programmingLanguage;
        this.framework=framework;
        this.knowsSelenium=knowsSelenium;
    }

    @Override
    public String toString() {
        return "Sdet{" +
                "programmingLanguage='" + programmingLanguage + '\'' +
                ", framework='" + framework + '\'' +
                ", knowsSelenium=" + knowsSelenium +
                '}';
    }
}

class Developer extends Employee{

    public Developer(String name, int age, double weight, String color, String employeeId, String title, double salary, String department) {
        super(name, age, weight, color, employeeId, title, salary, department);
    }
}



