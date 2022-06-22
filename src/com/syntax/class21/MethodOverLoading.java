package com.syntax.class21;

public class MethodOverLoading {

    static void add(int a, int b){
        System.out.println(a+b);
    }

    static void addDoubles(double a, double b) {
        System.out.println(a + b);
    }
    static void add3Doubles(double a, double b,double c) {
        System.out.println(a + b+c);
    }


    public static void main(String[] args) {
        add(20,20);
        addDoubles(20.5,25.0);

    }
}
