package com.syntax.class19;

public class Parent {
    String name="Misha";
    double money=1000000;

}
class Child extends Parent {// extends keyword allows us to access everything from Parent class in Child class;
    void printInfo(){
        System.out.println("My full name is Khrystyna "+name);//<---name comes from the Parent class
    }
    void buyCar(){
        System.out.println("Hehehe buying a car from Papa's money "+money);//same thing , using Parent class instances
    }
}
class Tester{
    public static void main(String[] args) {
        Child child=new Child();
        child.printInfo();
        child.buyCar();
    }
}