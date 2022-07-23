package Replit;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Replit208 {
   public static void display(Map<String, Integer> map) {
        if (!map.isEmpty()) {
            Set<Map.Entry<String, Integer>> entries = map.entrySet();
            for (Map.Entry<String, Integer> entry : entries) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }

        } else {
            System.out.println("map is empty");
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("mango", 10);
        map.put("apple", 30);
        map.put("orange", 20);
        map.clear();


    }

}