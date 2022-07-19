package com.syntax.class29;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
// HOW WE CAN REMOVE THE ELEMENTS FROM A MAP BASES ON THE KEYS
public class MapDemo5 {
    public static void main(String[] args) {
        HashMap<String, Double> fruit = new HashMap<>();
        fruit.put("Apple", 1.0);
        fruit.put("Orange", 2.5);
        fruit.put("Kiwi", 1.8);
        fruit.put("Banana", 2.0);
        fruit.put("Peach", 3.5);

        Set<String> keys = fruit.keySet();
        //NOT AN OPTION IF WE MODIFYING SIZE
       /* for (String key : keys) { // we cannot remove items or modify with enhanced for loop
            if(key.contains("e")){
                fruit.remove(key);
            }
            }
        */

// the best option(lambdas)
        keys.removeIf(key -> key.contains("e"));// That's how we remove elements from set with values (elements)
                                               // but first we have to create a Set for keys like we did above
        System.out.println(fruit);

//OR WE CAN DO IT WITH ITERATOR, but the code will be longer than when using lambdas
        Iterator<String>iterator= keys.iterator();//Iterator is the best if we are modifying size,( we cant use forloop
                                                 // or enhanced since we will get an error at runtime)
        while(iterator.hasNext()){
            if(iterator.next().contains("e")){
                iterator.remove();
            }
        }
        System.out.println(fruit);
    }
}

