package com.syntax.class29;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HW3 {
    /*
Create a map of Best Buy store. Place
item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
Retrieve all keys and values from a Best Buy map using EntrySet.
     */
    public static void main(String[] args) {
        TreeMap<Integer,String>bestBuy=new TreeMap<>();
        bestBuy.put(7664847,"Printer");
        bestBuy.put(7879885,"TV");
        bestBuy.put(7664385,"Washer");
        bestBuy.put(7664447,"Boombox");
        bestBuy.put(7637847,"Phone");
        bestBuy.put(7251847,"Console");

        // for(Map.Entry<Integer,String>entry:bestBuy.entrySet()){
        // System.out.println(entry.getKey()+":"+entry.getValue());
        // }
        Set<Map.Entry<Integer,String>> entries=bestBuy.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

    }
}
