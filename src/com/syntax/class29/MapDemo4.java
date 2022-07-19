package com.syntax.class29;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
// WAY TO GET ALL ENTRIES AT ONCE
public class MapDemo4 {
    public static void main(String[] args) {
        HashMap<String,Double> fruit=new HashMap<>();
        fruit.put("Apple",1.0);//automatic upcasting does not work with wrappers, so we have to be carefully with data we're writing
        fruit.put("Orange",2.5);
        fruit.put("Kiwi",1.8);
        fruit.put("Banana",2.0);
        fruit.put("Peach",3.5);
//.entrySet() is a part of the Set interface we use to get set of entries on map (keys and values)
        Set<Map.Entry<String,Double>> entries=fruit.entrySet();
        //iter-> shorcut for writing for each loop under specified condition like above

        for(Map.Entry<String,Double> entry:entries){// the method we use to return all the entries is entrySet() and we
        //put it inside the set, and then we specify what type of entries("Map.Entry")and then all the entries types inside
        //the Map(keys and values) .And it returns us it in a form of a set, and once we have a set we can do the loop,
        // iterator and so on
            System.out.println("Entry - "+entry);
        }
    }
}
