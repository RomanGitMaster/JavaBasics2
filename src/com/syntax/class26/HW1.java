package com.syntax.class26;

import java.util.ArrayList;

public class HW1 {
    /*
Create an ArrayList that will store 5 names into it.
Find out whether the given ArrayList is empty or not?
Check whether the specific name is present in an ArrayList or not?
Find the size of your arrayList and print all values from that
     */
    public static void main(String[] args) {
        ArrayList<String>names=new ArrayList<>(5);// always good to specify initial capacity to improve
                                                             // efficiency, improves performance
        names.add("Aladddin");
        names.add("Abu");
        names.add("Jasmine");
        names.add("Sultan");
        names.add("Jafar");
        System.out.println(names.isEmpty());
        System.out.println(names.contains("Abu"));
        System.out.println("Size of the arraylist is "+names.size());
       // System.out.println(names);
       for (String name:names){
           System.out.println(name);
       }



    }
}

