package com.syntax.class29;

import java.util.*;

// HERE WE DESCRIBE HOW OT GET ALL KEYS , OR VALUES FROM THE MAP
public class MapDemo3 {
    public static void main(String[] args) {
        HashMap<String,Double> fruit=new HashMap<>();
        fruit.put("Apple",1.0);//automatic upcasting does not work with wrappers, so we have to be carefully with data we're writing
        fruit.put("Orange",2.5);
        fruit.put("Kiwi",1.8);
        fruit.put("Banana",2.0);
        fruit.put("Peach",3.5);
        // How we print out all keys and values? Here how we can do it:

        Set<String>keys=fruit.keySet();//  all the keys from a map in a form through the for each loop
        for(String key:keys){
            System.out.println("key= "+key);
        }
        //ArrayList<Double>values= (ArrayList<Double>) fruit.values();// we may get the error at runtime for down-casting
        Collection<Double>values=fruit.values();
        for(Double value:values){
            System.out.println("Value = "+value);
        }



       }
}
