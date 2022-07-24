package com.syntax.class29;

import java.util.*;

public class HW4 {
    /*
    Create a Person class with following private fields: name, lastName, age, salary.
Variables should be initialized through constructor.
Inside the class also create a method to print user details.
In Test Class create a Map that will store key in ascending order. In that map store personId and a Person Object. Print each object details.
     */
}

class Person {
    private String name;
    private String lastName;
    private int age;
    private int salary;

    Person(String name, String lastName, int age, int salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
        toString();
    }

    @Override
    public String toString() {// type toString and generate by wizard method to return all the values of the instance variables
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
/*
    void getInfo() {
        System.out.println(name + " " + lastName + " " + age + " has salary " + salary + " $");
    }

 */
}

class TestPerson {
    public static void main(String[] args) {
        //Person[] person = {new Person("Jason", "Broudy", 27, 78000), new Person("Dack", "Hensworth", 32, 92000), new Person("Elie", "Dowson", 24, 76000)};

        TreeMap<Integer, Object> employees = new TreeMap<>();
        employees.put(12345, new Person("Jason", "Broudy", 27, 78000));
        employees.put(12346, new Person("Dack", "Hensworth", 32, 92000));
        employees.put(12347, new Person("Elie", "Dowson", 24, 76000));


    }

}


