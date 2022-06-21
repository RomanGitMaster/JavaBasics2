package com.syntax.class20;

public class SuperDemo {
    public static void main(String[] args) {
        Chair chair = new Chair();
        chair.printColor();
    }
}

class Furniture {
    String color = "Black";
}

class Chair extends Furniture {
    String color = "Grey";

    void printColor() {
        String color = "White";// if we write just name COLOR and assign "WHITE" we will reassign existing class Chair instance color
        // but if we do STRING COLOR="WHITE" we will create LOCAL variable which
        // so it will influence outcome and class instance depending on how we write it
        System.out.println(color);//<=== changes color variable to WHITE and print it
        System.out.println(this.color);//<=== get color of this (ChAIR) class
        System.out.println(super.color);//<===gets color from parent(super class) class( we can only call instance variables from
                                        // parent class

    }
}


