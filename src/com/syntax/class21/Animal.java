package com.syntax.class21;

public class Animal {
    String name;
    String color;
    String breed;
    int age;
    public Animal(String name,String color,String breed,int age){
        this.name=name;
        this.color=color;
        this.breed=breed;
        this.age=age;

    }
    void printInfo(){
        System.out.println(name+ color+ breed+ age);
    }
}
class Dog extends Animal{
    public Dog(String name, String color, String breed, int age) {// we created constructor to link parent constructor
        super(name, color, breed, age);// we use super( keyword) to link Dog constructor variables with parent variables
    }
}
