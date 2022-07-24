package com.syntax.class29;

import java.util.*;

public class HW2 {
    /*
    Create a map of countries with its capital that will store countries in alphabetical order.
Print all keys and values from a country map using for each loop and iterator.
Print all values from a country map using for each loop and iterator.
     */
    public static void main(String[] args) {
        TreeMap<String, String> list = new TreeMap<>();
        list.put("USA", "Washington DC");
        list.put("Ukraine", "Kiev");
        list.put("Spain", "Madrid");
        list.put("Turkey", "Ankara");
        list.put("Poland", "Warsaw");
        list.put("Britain", "London");
       /* for(Map.Entry<String,String> entry: list.entrySet()){
         System.out.println("entry key = " + entry.getKey()+"entry value = " +entry.getValue());
         //shorter way to write a for each loop
        */

        System.out.println("All entries with for loop: ");
        Set<Map.Entry<String, String>> entries = list.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry);
        }
        System.out.println();




        System.out.println("All entries with iterator: ");
        Iterator<Map.Entry<String, String>> iterator = list.entrySet().iterator();
        while (iterator.hasNext()) {
            //System.out.println("entry.getKey()= " + entry.getKey()+" value ="+ entry.getValue());
            System.out.println(iterator.next());
        }

        System.out.println();
        System.out.println("All values with for loop: ");
        Collection<String> values = list.values();
        for (String value : values) {
            System.out.println(value);
        }

        System.out.println();
        System.out.println("All values with iterator: ");
        Iterator<String> iterator1 = values.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
    }
}

