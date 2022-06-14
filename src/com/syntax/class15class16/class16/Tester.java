package com.syntax.class15class16.class16;

public class Tester {
    public static void main(String[] args) {
        AccessModifiersDemo1 ac=new AccessModifiersDemo1();
       //System.out.println(ac.password);<---- cannot be accessed since that variable was private and can be accessed in that particular class
        System.out.println(ac.name);//<--- since that instance variable public it can be accessed outside the class
    }
}
