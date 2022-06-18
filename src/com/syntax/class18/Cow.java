package com.syntax.class18;

public class Cow {

    String breed;
    String color;
    int age;
    double weight;

    Cow(String breed, String color, int age, double weight) {
        // when we have same name variables as local and instance inside a class always local variables are preferred
        // over instance variables by java in block of code.
        // we can use "this" instead of repeating ourselves with breed=breed--> this.breed=breed;
        //"this." is a keyword that can be used to refer to current class instance variable.
        this.breed = breed;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }

    String printCowInfo() {
        return breed + " " + color + " " + age + " " + weight;
    }
}