package com.syntax.reviewclass10;

public class FlowerTester {
    public static void main(String[] args) {// java looks for main method to start execution, and looks exactly for
        // PUBLIC STATIC VOID MAIN (STRING[] ARGS), if something is not mathcing run button will disappear, java will
        // not consider it main method .Name (args) can be anything, its just name of a variable
        Rose rose = new Rose("red");
        rose.showColor();//overriden
        rose.bloom();//overriden
        rose.smell();//inherited from parent but not overriden
        rose.thorns();// avaible only to Rose class
        System.out.println("=============================================================");
        Flower flower = new Rose("green");
        flower.showColor();
        flower.bloom();
        flower.smell();
        //flower.thorns();---> cant be executed since it not present in Flower class and available to Rose class only
        //Parent class cannot use methods of child classes
        Rose rose1 = (Rose) flower;// type casting we trying to use methods of rose using flower
        rose1.thorns();


        System.out.println("=============================================================");
        Flower[] flowers = {new Rose("red"), new Tulips("yellow")};//all methods from all objects will be
        // available for use in many ways- POLYMORPHISM
        for (Flower flower1 : flowers) {
            flower1.bloom();
            flower1.smell();
            flower1.showColor();
        }
        main("don't get confused lol");
    }

    public static void main(String args) {
        System.out.println("hehehehehehe");
    }
}
