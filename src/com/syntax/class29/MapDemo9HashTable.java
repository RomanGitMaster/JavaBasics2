package com.syntax.class29;

import java.util.Hashtable;
//HASHTABLE IN JAVA
public class MapDemo9HashTable {
    public static void main(String[] args) {
// Creating a Hashtable
        Hashtable<String, String> hashtable = new Hashtable<>();
// Adding Key and Value pairs to HashTable
        hashtable.put("Key1", "Chaitanya");
        hashtable.put("Key2", "Ajeet");
        hashtable.put("Key3", "Peter");
        hashtable.put("Key4", "Ricky");
        hashtable.put("Key5", "Mona");
        System.out.println(hashtable);
// Retrieving all keys and values from HashTable
        for (String key : hashtable.keySet()) {
            System.out.println(key + ":" + hashtable.get(key));
        }
    }
}
