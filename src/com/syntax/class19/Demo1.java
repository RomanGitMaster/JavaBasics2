package com.syntax.class19;

public class Demo1 {

    String name="Sleeping Zombie";

    void printName(){
        String name="wake up zombie";
        System.out.println(name);//<---- Java always prefers local variables
        System.out.println(this.name);//<--- but in this case we specify with THIS keyword we need instance "name",
                                      // this keyword refers only to instance variables.

    }

    public static void main(String[] args) {
        Demo1 z=new Demo1();
        z.printName();
    }
}
