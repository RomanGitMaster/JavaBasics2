package com.syntax.class15class16.class15;

public class MethodDemo1 {

    void method1(){
        System.out.println("I can use print statements in a void type method");
       int num=0;
      //  return 0;void means no data will be returned from this method
    }

    public static void main(String[] args) {
        MethodDemo1 MethodDemo1=new MethodDemo1();
        //int x=methodDemo1.method(); methods with void return type can't be assign to a variables
    }
}
