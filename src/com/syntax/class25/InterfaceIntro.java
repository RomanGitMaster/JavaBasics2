package com.syntax.class25;

public interface InterfaceIntro  {
    /*
    Interface - a template that can be applied to class.

    Similar to inheritance, but specifies what a class has/must do.
    Classes can aplly more than one interface, inheritance is limited to 1 super
    ***
    All variables declared in Interfaces are public, static, final
    Interface can only have abstract methods ( static and default since Java 8,  private since Java 9)

    DEFAULT METHOD in interface: you can define method but since its interface method (just like abstract methods)
    it cannot have body, however we can explicitly let Java know it needs to have body in interface and add "default" to it.


   STATIC METHOD is following the same rules  in Java
     */
int MAX=10;
String ERRORMSG="Cannot go above value: "+ MAX;
int getNext();

default void printStuff(){
    System.out.println("Live from Phila. Its Saturdy.");
}// interface abstract methods cannot have body, hovewer adding DEFAULT letting explicitly know this method has to
// have body of code



}
