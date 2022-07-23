package com.syntax.class29;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;

public class MapDemo10 {
    //how to loop Map in Java
    public static void main(String[] args) {
        Map<String, Integer> classroomMap=new LinkedHashMap<>();
        classroomMap.put("Table", 20);//Entry<Key, Value>
        classroomMap.put("Chair", 60);//Entry<String, Integer>
        classroomMap.put("Screen", 3);
        classroomMap.put("Student", 60);
        classroomMap.put("Instructor", 3);
        Set<Map.Entry<String, Integer>> entrySet=classroomMap.entrySet();
        System.out.println("---------using for each loop to get all entry objects");
        for(Map.Entry<String, Integer> entry:entrySet) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
        System.out.println("---------using iterator to get all entry objects");
        Iterator<Map.Entry<String, Integer>> entryIterator=entrySet.iterator();
        while(entryIterator.hasNext()) {
            Map.Entry<String, Integer> ent=entryIterator.next();
            String entry=ent.getKey()+"----"+ent.getValue();
            System.out.println(entry);
        }
    }
}
