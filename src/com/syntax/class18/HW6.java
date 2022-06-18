package com.syntax.class18;

public class HW6 {
    //Write a java class that have 4 constructors with 4 different access levels of constructors(private,public,default,protected)
    //and create 4 objects of this class: 1 - inside same class; 2 - from outside the class;3 - from different class inside
    // different package  and observe result.
  String magicOfConstructor;
   private HW6(int x){

       System.out.println("Private"+x);
    }
    public HW6(String dope) {
       System.out.println("Public is "+dope);
    }

    protected HW6(char a) {

           System.out.println("Protected is "+a);
       }
       HW6(){
           System.out.println("Default");
       }

    public static void main(String[] args) {
       HW6 constructo1= new HW6(2);
    }
}
