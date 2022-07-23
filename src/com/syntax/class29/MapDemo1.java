package com.syntax.class29;

import java.util.HashMap;

public class MapDemo1 {
    public static void main(String[] args) {
        HashMap<String,Double>fruit=new HashMap<>();
        fruit.put("Apple",1.0);//automatic upcasting does not work with wrappers, so we have to be carefully with data we're writing
        fruit.put("Orange",2.5);
        fruit.put("Kiwi",1.8);
        fruit.put("Banana",2.0);
        fruit.put("Apple",1.0);// since duplicates are not allowed,which means we basically overwrite value for Apple we entered before
        System.out.println(fruit);
        System.out.println(fruit.get("Kiwi"));// we are getting the value by key
        fruit.remove("Orange");// when we remove the element by key
        System.out.println(fruit);
        System.out.println(fruit.containsKey("Kiwi"));// if we search for key, and it checks if it is present or not
        System.out.println(fruit.containsValue(1.8));// if we search for value, and it checks if it is present or not
        System.out.println(fruit.isEmpty());// checks if there are any elements( keys in fruit)
        fruit.replace("Kiwi",5.2);// we are replacing the value for the key "Kiwi"
        System.out.println(fruit);
        fruit.put(null,null);// in HashMap
        System.out.println(fruit);




    }
}
