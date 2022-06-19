package com.syntax.class18;

public class HW4Pirate {
    //Write a java class that will have a constructor: one with parameters and second without
    //any parameters. Create a separate Test class where you will execute both of the constructors 1 by 1.
String pirate;
String ship;
String weapon;
boolean real;
HW4Pirate(){}
 HW4Pirate(String pirate,String ship,String weapon,boolean real){
  this.pirate=pirate;
  this.ship=ship;
  this.weapon=weapon;
  this.real=real;
   }

void display(){
    System.out.println("Pirate "+pirate+" sails on "+ship+" ship, fights with "+weapon+" and he is a "+real+" pirate!");
}

    }

