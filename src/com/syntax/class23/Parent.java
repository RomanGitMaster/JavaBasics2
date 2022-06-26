package com.syntax.class23;

public class Parent {
    public static void eat(){
        System.out.println("I like to eat seafood");
    }
    public static void sleep(){
        System.out.println("I like to sleep 8 hours");
    }
    public static void activity(){
        System.out.println("go to beach");
    }
}
class Child extends Parent{

        public static void activity(){
            System.out.println("Im very religious");
        }

}
class Tester {
    public static void main(String[] args) {

        Child karla = new Child();
        karla.sleep();
        karla.activity();
    }
}