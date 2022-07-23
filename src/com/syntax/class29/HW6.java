package com.syntax.class29;

import java.util.LinkedHashSet;

public class HW6 {
    /*
    Create the collection that will store single uniques Objects of a String type in which order is preserved.
Write a logic to concatenate all string from the collection.
     */
    public static void main(String[] args) {
        LinkedHashSet<String>collection=new LinkedHashSet<>();
        collection.add("Alladin");
        collection.add("flies");
        collection.add("on");
        collection.add("magic");
        collection.add("carpet");
        String concat="";
        for (String string : collection) {
            concat+=(string+" ");
        }
        System.out.println(concat);
    }
}
