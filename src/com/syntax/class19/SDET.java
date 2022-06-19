package com.syntax.class19;

public class SDET extends Human {
    boolean goodWithJava;

    SDET(String name, String eyeColor, String job, int age, boolean goodWithJava) {
        this.name = name;//this.name is coming from Human("parent") class , so this. calling instance from class Human
        this.eyeColor = eyeColor;
        this.job = job;
        this.age = age;
        this.goodWithJava = goodWithJava;
    }

    void printInfo() {
        System.out.println("My name is " + name + " I do " + job + " am I good with Java " + goodWithJava);
    }

    public static void main(String[] args) {
        SDET sdet = new SDET("Sameer", "black", "gym", 22, true);
    }
}
