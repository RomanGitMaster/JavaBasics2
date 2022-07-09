package com.syntax.class15class16.class15;

public class VariablesDemo1 {


    String breed;// Instance variable
    static int num=5;// Static variables and we can store values with static variables

    void printName(){
        String name="local";// Local variable
        System.out.println(name);
    }
    static void printName2() {
        String name = "local";// Local variable
        System.out.println(name);
    }
    public static void main(String[] args) {
        VariablesDemo1 v=new VariablesDemo1();
        v.printName();
        System.out.println(VariablesDemo1.num);//<---- to call static variable
        VariablesDemo1.printName2();//<----to call static method, by just writing name of that class
    }
}
