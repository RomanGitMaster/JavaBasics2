package com.syntax.class29;

import java.util.Collection;
import java.util.HashMap;
// HOW WE CAN REMOVE THE ELEMENTS FROM A MAP BASES ON THE VALUES
public class MapDemo6 {
    public static void main(String[] args) {
        HashMap<String, Double> fruit = new HashMap<>();
        fruit.put("Apple", 1.0);
        fruit.put("Orange", 2.5);
        fruit.put("Kiwi", 1.8);
        fruit.put("Banana", 2.0);
        fruit.put("Peach", 3.5);

        Collection<Double>values=fruit.values();
        values.removeIf(value->value>2.0);// specifying variable (in which we stored map fruits values- on which we do
        // method .values()to get them) then aplaying removeIf() method (and specifying lamdba type argument?)
        System.out.println(fruit);
        //OR WE CAN DO IT WITH ITERATOR, but the code will be longer than when using lambda expression





    }
}
