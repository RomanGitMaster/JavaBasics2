package com.syntax.class26;

import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {
        String name="Aladdin";
        String name2="Abu";
        String name3="Gynie";

        String []names={"Aladdin","Abu","Gynie"}; // storing names by use of string
        names=new String[4];
        names[0]="Aladdin";
        names[1]="Abu";
        names[2]="Gynie";
        names[3]="Sultan";
        //System.out.println(names.length);

        ArrayList<String>syntaxStudents=new ArrayList<>();//<> diamond operator, helps us now that we are using this
                                                         // class to store STRINGS and not creating an object
                                                         // <> allows us to use different data types

        System.out.println(syntaxStudents.size());
        syntaxStudents.add("Jasmine");// adding element(String) to arraylist
        System.out.println(syntaxStudents.size());
        syntaxStudents.add("Carpet");
        System.out.println(syntaxStudents.size());


       // create arraylist and store odd numbers
        ArrayList<Integer>numbers=new ArrayList<>();
        System.out.println(numbers.size());
        for (int i=1;i<=10;i++){

            if(i%2!=0){
                numbers.add(i);
            }else {
                continue;
            }
        }
        System.out.println(numbers);

        /* OR

            for(int i=1;i<10;i=i+2){
            number.add(i);
        }
          System.out.println(number);

         */





    }
}
