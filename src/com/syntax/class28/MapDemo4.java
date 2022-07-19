package com.syntax.class28;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo4 {
    //TreeMap implements the Map interface and it is a collection that sorts its keys in the ascending order.
    // It cannot have null key but can have multiple null values.
    // TreeMap is un synchronized collection class which means it is not
    //suitable for thread-safe operations.
    public static void main(String[] args) {
        TreeMap<Integer, String> tmap =   new TreeMap<>();
        /*Adding elements to TreeMap*/
        tmap.put(1, "Data1");
        tmap.put(23, "Data2");
        tmap.put(70, "Data3");
        tmap.put(4, "Data4");
        tmap.put(2, "Data5");
        System.out.println(tmap);
        //Display content using Iterator


    }
}
