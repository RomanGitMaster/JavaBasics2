package com.syntax.class28;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {

        HashMap<String, Integer> grocieries = new HashMap<>();
        grocieries.put("eggs", 12);// put() method whenever we have to add elements (instead of add() as in List collections)
        // where "Milk" is a key and 12 is a value
        grocieries.put("milk", 4);
        grocieries.put("apple", 1);
        grocieries.put("fish", 25);


        System.out.println(grocieries.get("milk")); // to get value of milk we write element.get(key)
        System.out.println(grocieries.get("fish"));

        Map<Integer, String> studentMap = new HashMap<>();//<---since we specified Data type in angle brackets in order
        // Integer -String,we will be adding or accessing elements by Integer key and String value unlike first time above
        // where String was a key and value was Integer
        studentMap.put(101, "John");
        studentMap.put(102, "Jason");
        studentMap.put(103, "Jordan");
        studentMap.put(104, "Jenny");
//to check if specific key or value exist
        System.out.println(studentMap.containsKey(101));
        System.out.println(studentMap.containsValue("Jordan"));
//to access 1 value
        System.out.println(studentMap.get(102));
//replace value
        studentMap.replace(104, "Nikky");
        System.out.println(studentMap);
//remove object
        studentMap.remove(103);
        System.out.println(studentMap);



//MORE PRACTICE
        HashMap<Integer, String> hashmap = new HashMap<>();

        hashmap.put(11, "Chaitanya");
        hashmap.put(22, "Pratap");
        hashmap.put(44, "Rajesh");
        hashmap.put(55, "Kate");
        boolean flag = hashmap.containsKey(22);
        System.out.println("Key 22 exists in HashMap? : " + flag);

        boolean flag2 = hashmap.containsKey(55);
        System.out.println("Key 55 exists in HashMap? : " + flag2);

        boolean flag3 = hashmap.containsKey(99);
        System.out.println("Key 99 exists in HashMap? : " + flag3);




    }
}
