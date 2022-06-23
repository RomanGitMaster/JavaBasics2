package com.syntax.class22;

public class AdvanceCalc {
    // In this class we reviewed some ways to make coding easier
    static void sum(int... arr) {// for us not to add parameters every time for method overloading we use "..."
        // System.out.println(arr[3]);
        for (int i = 0; i < arr.length; i++) {// just an example to print out all the numbers
            System.out.println(arr[i]);
        }
    }

    static void printNames(String... names) {
        for (String name : names) {
            System.out.println(name);
        }

    }

    public static void main(String[] args) {
        sum(2, 3, 4);//<===== no matter how many we put "..." dots will add parameters
        int age = 10;
        String name;
        if (age > 18) {
            name="Time to go Work";
        } else {
            name="Enjoy no Work";
        }
        System.out.println(name);
        //Ternary operator
        String name2=age>18?"Time to go Work":"Enjoy no Work";// same as code above but shorter and cleaner
        System.out.println(name2);
        //or with nested If else condition:
         String name3=age>18?age>10?" nested if":"It is nested else":"Enjoy no Work";
    }
}
