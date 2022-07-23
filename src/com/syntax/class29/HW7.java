package com.syntax.class29;

import java.util.ArrayList;

public class HW7 {
    /*
    Create a collection of integers in which you can keep duplicates.
Write a logic to find sum of all integers
     */
    public static void main(String[] args) {
        ArrayList<Integer>collection=new ArrayList<>(5);
        collection.add(5);
        collection.add(3);
        collection.add(8);
        collection.add(5);
        collection.add(8);
        collection.add(3);
        collection.add(6);
        collection.add(5);
        Integer sum=0;
        for (Integer number: collection) {
            sum+=number;
        }
        System.out.println(sum);

    }
}
