package com.syntax.class21;

public class MethodOverloading3 {
// Java check for how many parameters,data types and sequence of parameters and then selects
// the method even all methods have the same name.
    void method(){
        System.out.println("1");
    }

    void method(String name) {
        System.out.println("2");
    }

    void method(String name, int num) {//<=== in our case this is the match for the data we provided and the sequence
        System.out.println("3");
    }

    void method(int num2, int num) {
        System.out.println("4");
    }

    public static void main(String[] args) {
        MethodOverloading3 test=new MethodOverloading3();
        test.method("hamid",50);
    }
}
