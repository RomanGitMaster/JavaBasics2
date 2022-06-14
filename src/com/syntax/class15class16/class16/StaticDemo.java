package com.syntax.class15class16.class16;

public class StaticDemo {

    static int numOfEmployees = 10;
    String name;

    static void md1() {// only single method only works with STATIC values(no instances variables values)

        System.out.println(numOfEmployees);
        //System.out.println(name);<---cannot access non static values,
        // because each object of the class will have own copy of this variable with own value
    }

    void md2() {
        System.out.println(name);
        System.out.println(numOfEmployees);
    }


    public static void main(String[] args) {
        StaticDemo st = new StaticDemo();
        st.name = "Omid";

        StaticDemo st2 = new StaticDemo();
        st2.name = "Rachid";
    }
}