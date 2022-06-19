package com.syntax.class19;

 class Animal {

     String name;
     String breed;
     String color;
     int age;
     double weight;

     void display() {
         System.out.println("Name " + name + " color " + color);
     }
 }
// we can inherit from any class or packages only if that class is declared "public"
     public class Dog extends Animal {
         Dog(String name, String color) {
             this.name = name;// using extends key word we are able to access any instance variables from Animal class
             this.color = color;

         }

     }

     class Cat extends Animal {
         Cat(String name, String color) {
             this.name = name;
             this.color = color;

         }

     }

