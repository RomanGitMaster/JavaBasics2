package com.syntax.class22;

public class Parent {
    String name;
    void getMarried(){
        System.out.println("hey Hammid we have found a girl for you , get mary to that girl");
    }
}
class Hamid extends Parent{
    @Override
    void getMarried() {
        System.out.println("I want try Tara first");//if we dont use override super class method will be used with
                                                    //its values

    }

    public static void main(String[] args) {
        Hamid hamid=new Hamid();
        hamid.getMarried();
    }
}