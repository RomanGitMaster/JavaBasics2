package com.syntax.class21;

public class HW2Programming {
    /*
    Create a class named 'Programming'. While creating an object of the class, if nothing is passed to it, then the
    message "I love programming languages" should be printed. If some String is passed to it, then in place of
    "programming languages" the value variable should be printed. Example, if we pass "Java", then "I love Java"
    should be printed.
     */
    HW2Programming(){
        System.out.println("I love programming languages");
    }
    HW2Programming(String str){
        System.out.println("I love programming "+str);
    }

    public static void main(String[] args) {
        HW2Programming object=new HW2Programming();
        HW2Programming object2=new HW2Programming("JavaVava");
    }
}
