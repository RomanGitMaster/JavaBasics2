package com.syntax.class23;

public class Animal {// iof we use final keyword no other class can inherit from animal class because it declared FINAL
   //EXAMPLE: public final Animal{}
    Animal(){
        System.out.println("Parent");
    }
    final double g=9.8; // when used with the variable means noone can change that variable
    void eat(){ //same with methods
        System.out.println("All the animal eat");
    }

}
class Panda extends Animal{
    void eat(){
        System.out.println("All the animal eat");
    }
    Panda(){
        System.out.println("Child");
    }
}
class Tester1{
    public static void main(String[] args) {
        new Panda();
    }
}