package com.syntax.class15class16.class15;

public class variablesDemo2 {

    int num=10;// can be accessed by all methods
               // whenever you have to share same data type of a class use instance

    void method1(){
        int num2=20; // local variables are only accessible inside the method
        System.out.println(num);
    }
    void method2(){
       // System.out.println(num2);<---error since its local variable and can be accessed withing same block of code(method1)
        System.out.println(num);
    }

}
