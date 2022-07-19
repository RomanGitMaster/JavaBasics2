package com.syntax.class29;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapDemo2 {
    public static void main(String[] args) {
        TreeMap<String,Integer>fruit=new TreeMap<>();
        fruit.put("apple",2);
        fruit.put("watermelon",4);
        fruit.put("peach",3);
        fruit.put("strawberry",2);

        HashMap<String,Integer> cosmetic=new HashMap<>();
        cosmetic.put("foundation",20);
        cosmetic.put("lipstick",25);
        cosmetic.put("mascara",30);
        cosmetic.put("blush",50);


        LinkedHashMap<String,Integer> groceries=new LinkedHashMap<>();
        groceries.putAll(fruit);
        groceries.putAll(cosmetic);
        System.out.println(groceries);

    }
}
