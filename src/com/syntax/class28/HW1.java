package com.syntax.class28;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HW1 {
    /*How can you remove all duplicates from ArrayList?

     */
    public static void main(String[] args) {
        List<String> aList=new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");

        HashSet<String>hset=new HashSet<>();
        hset.addAll(aList);
        System.out.println(hset);

        for(String h:hset){
            System.out.print(h+" ");

        }
    }
}
