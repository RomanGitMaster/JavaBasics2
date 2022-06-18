package com.syntax.class18;

public class ThisKeywordDemo {

    String name = "Instance";

    public static void main(String[] args) {
        ThisKeywordDemo t = new ThisKeywordDemo();
        t.printName();
    }

    void printName() {
        String name = "local";
        System.out.println(name);
        System.out.println(this.name);// even  local name was to changed to "local" ny using this. we are still
        // referring to instance of the class
    }
}

