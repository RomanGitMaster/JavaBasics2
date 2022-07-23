package com.syntax.class29;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
//HOW WE CAN REMOVE THE ELEMENTS FROM A MAP BASES ON A KEYS AND VALUES USING ITERATOR
public class MapDemo8 {
    public static void main(String[] args) {
        HashMap<String, Double> fruit = new LinkedHashMap<>();
        fruit.put("Apple", 1.0);
        fruit.put("Orange", 2.5);
        fruit.put("Kiwi", 1.8);
        fruit.put("Banana", 2.0);
        fruit.put("Peach", 3.5);

        Iterator<Map.Entry<String,Double>>iterator=fruit.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String,Double> en=iterator.next();
            if(en.getKey().contains("e") && en.getValue()>2.0){// if we add another condition with .next() method for example
            // (iterator.next().getKeys().contains("e") && iterator.next().getValues()>2.0) we will have an
            // issue since next() moves the pointer to next element every time we using it, so our best approach would be
            // (specified above if condition)
            //SO WE CANNOT CALL NEXT() METHOD MORE THAN ONCE BUT WE CAN DODGE IT BY USING ABOVE APPROACH
                iterator.remove();
            }
        }
        System.out.println(fruit);
    }
}
