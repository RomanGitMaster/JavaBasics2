package Replit;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Replit206 {
    /*
    Hash Map
Create a Hash Map of String pairs
add the follow values
map.put("ONE","AAA");
map.put("TWO","BBB");
map.put("THREE","CCC");
map.put("FOUR","DDD");
map.put("FIVE","EEE");
Using entry set print key and values pairs using loop
Remove below from Map
"ONE"
"FOUR"
Using entry set print key and values pairs using loop
Expected Output:
HashMap Before Remove :
FIVE : EEE
ONE : AAA
FOUR : DDD
TWO : BBB
THREE : CCC
------------------
HashMap After Remove :
FIVE : EEE
TWO : BBB
THREE : CCC
     */
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("ONE","AAA");
        map.put("TWO","BBB");
        map.put("THREE","CCC");
        map.put("FOUR","DDD");
        map.put("FIVE","EEE");

        Set<Map.Entry<String,String>>entries=map.entrySet();
        System.out.println("HashMap Before Remove :");
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
        System.out.println("------------------");
        entries.removeIf(entry->entry.getKey().equals("ONE")||entry.getKey().equals("FOUR"));
        System.out.println("HashMap After Remove :");
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}
