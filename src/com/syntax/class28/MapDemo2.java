package com.syntax.class28;

import java.util.HashMap;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {

        HashMap<String, Integer> groceries = new HashMap<>();
        groceries.put("eggs", 12);
        groceries.put("milk", 4);
        groceries.put("apple", 1);
        groceries.put("fish", 25);
        groceries.replace("eggs",null);
        groceries.put("eggs", 16);// key duplicates are not allowed so this one just overwrites value for previous one
        System.out.println(groceries);

        Set<String> key=groceries.keySet();
        for(String s:key){
            System.out.println(s);
        }


    }
}
