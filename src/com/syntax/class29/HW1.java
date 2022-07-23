package com.syntax.class29;

import java.util.LinkedHashMap;

import java.util.Map;

public class HW1 {
    /*
    Create a map of a building. Store floor number and it is associated company name. (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
Check how many entries you have?
Update company on a 4th floor
Remove company on the 7th floor
Print your map
     */
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> buildingMap=new LinkedHashMap<>();
        buildingMap.put(1,"Google");
        buildingMap.put(2,"Syntax");
        buildingMap.put(3,"Abrakadabra");
        buildingMap.put(4,"Durara");
        buildingMap.put(3,"Mcdonalds");
        buildingMap.put(5,"Microsoft");
        buildingMap.put(7,"Google");
        System.out.println(buildingMap.size());
        buildingMap.replace(4,"Durara","Shazam Industries");
        buildingMap.remove(7,"Google");
        System.out.println(buildingMap);
    }
}
