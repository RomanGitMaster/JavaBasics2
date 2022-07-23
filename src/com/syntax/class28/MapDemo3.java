package com.syntax.class28;

import java.util.LinkedHashMap;

public class MapDemo3 {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> lmap = new LinkedHashMap<>();
// Add Elements in the HashMap
        lmap.put(1, "Anshul");
        lmap.put(12, "Mirilla");
        lmap.put(10, "Terrna");
        lmap.put(15, "Eden");
        lmap.put(19, "Matt");
        lmap.put(null,null);// it can contain null key and value
        //lmap.put(null,"bro");//but it not allows duplicates, it will overwrite the value
       //lmap.put(20,"bro");//but it can contain duplicate values if keys are diferent


        System.out.println("LinkedHashMap before modification" + lmap);
        System.out.println("Is Employee ID 15 exists: " + lmap.containsKey(15));
        System.out.println("Is Employee name Terrna Exists: " + lmap.containsValue("Terrna"));
        System.out.println("Total number of employees: " + lmap.size());
        System.out.println("Removing Employee with ID 12: " + lmap.remove(12));
        System.out.println("Removing Employee with ID 33 (which does not exist): " + lmap.remove(33));// will provides us null value since it doesnt exsist in our LInkedHashMap lmap
        System.out.println("LinkedHashMap After modification" + lmap);

    }
}
