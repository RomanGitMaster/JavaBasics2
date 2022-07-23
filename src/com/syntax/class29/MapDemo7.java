package com.syntax.class29;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
//EXAMPLE ON HOW TO MANIPULATE DATA IN MAPS USING LAMBDAS
public class MapDemo7 {
    public static void main(String[] args) {
        HashMap<String, Double> fruit = new HashMap<>();
        fruit.put("Apple", 1.0);
        fruit.put("Orange", 2.5);
        fruit.put("Kiwi", 1.8);
        fruit.put("Banana", 2.0);
        fruit.put("Peach", 3.5);

        /*
        fruit.entrySet()---> All the entries from a map
        Where Entry is an interface that is inside the Map interface( check Room interface example )
         */
        Set<Map.Entry<String, Double>> entries = fruit.entrySet();

        //if key contains letter "e" AND if its price is greater than 2.0 we
        entries.removeIf(entry->entry.getKey().contains("e")&& entry.getValue()>2.0);
        System.out.println(fruit);



    }
}
