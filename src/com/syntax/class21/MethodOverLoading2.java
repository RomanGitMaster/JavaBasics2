package com.syntax.class21;

public class MethodOverLoading2 {


    static void add(int a,int b){
        System.out.println(a+b);
    }

    static void add(double a,double b){
        System.out.println(a+b);
    }

    static void add(double a,double b,double c){
        System.out.println(a+b+c);
    }

    public static void main(String[] args) {
        add(20,20);

    }
}

