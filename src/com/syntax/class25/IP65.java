package com.syntax.class25;
//NOTE : It must be either 1 public class or Public interface

public interface IP65 {// all the interfaces are ABSTRACT by default
  /* Interface - a template that can be applied to class.

    Similar to inheritance, but specifies what a class has/must do.
    Classes can apply more than one interface, inheritance is limited to 1 super
    ***
    All variables declared in Interfaces are public, static, final (they all by default in Interface
    treated as PUBLIC STATIC FINAL )so we must give initial value(expects value, value must be assigned, cannot be changed)

    Interface can only have abstract methods ( static and default since Java 8,  private since Java 9)
    DEFAULT METHOD in interface: you can define method but since its interface method (just like abstract classes)
    it cannot have body, however we can explicitly let Java know it needs to have body and add "default" to it.

    Interfaces are set of rules

   */
    String make="Samsung";// public static final
    void wash();// public
}
interface FiveG{
  void speed();
}
interface  FastVhargAble{
  void charging();
}
//
class S21Ultra implements IP65,FastVhargAble,FiveG {


  @Override
  public void wash() {
    System.out.println("You guys can wash me easily no issue");
  }

  @Override
  public void charging() {
    System.out.println("it supports charging now because i have implement this requirement as well");
  }

  @Override
  public void speed() {
    System.out.println(" you can download things super fast because now i also support 5G");
  }

  public static void main(String[] args) {
    IP65 ip65=new S21Ultra(); //an interface reference can point to object of its implementing classes

    }
}