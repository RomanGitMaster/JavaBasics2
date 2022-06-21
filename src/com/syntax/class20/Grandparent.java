package com.syntax.class20;

public class Grandparent {

    String name="Roman";

}
class Parent extends Grandparent{
    void printInfo(){
        System.out.println("name of my father is "+name);
    }
}
class Child extends Parent {
    void printInfo() {
        System.out.println("Name of my Granpa is "+name);
    }
}
class GrandChild extends Child {
    void printInfo() {
        System.out.println("My grand grand fathers name is " + name);
    }


    public static void main(String[] args) {
        GrandChild grandChild = new GrandChild();
        grandChild.printInfo();
    }
}