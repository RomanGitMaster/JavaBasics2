package com.syntax.class28;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class HW3 {
    /*
    Create a Set of cities in which you want to make sure that insertion order is maintained. Then remove any city that
    starts with “A”;
     */
    public static void main(String[] args) {
        Set<String> cities=new LinkedHashSet<>(6);
        cities.add("Boston");
        cities.add("New York");
        cities.add("Atlantic City");
        cities.add("Chicago");
        cities.add("LA");
        cities.add("Washington");
        Iterator<String>iterator=cities.iterator();
        while(iterator.hasNext()){
            if(iterator.next().startsWith("A")){
                iterator.remove();
            }
        }
        System.out.println(cities);







    }
}
