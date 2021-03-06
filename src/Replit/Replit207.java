package Replit;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Replit207 {
    /*
    Create Hash Map.
add the follow values
map.put("ONE","AAA");
map.put("TWO","BBB");
map.put("THREE","CCC");
map.put("FOUR","DDD");
map.put("FIVE","EEE");
Using EntrySet print the key and values pairs using iterator only
replace with below key THREE--> ASEL and key FIVE-->SUMAIR
Using EntrySet print the key and values pairs using iterator only
OUTPUT
HashMap Before Replace :
FIVE : EEE
ONE : AAA
FOUR : DDD
TWO : BBB
THREE : CCC
------------------
HashMap After Replace :
FIVE : SUMAIR
ONE : AAA
FOUR : DDD
TWO : BBB
THREE : ASEL
     */
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("ONE", "AAA");
        map.put("TWO", "BBB");
        map.put("THREE", "CCC");
        map.put("FOUR", "DDD");
        map.put("FIVE", "EEE");


        System.out.println("HashMap Before Replace :");
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> x = iterator.next();
            System.out.println(x.getKey() + " : " + x.getValue());
        }
        System.out.println("------------------");
        map.put("THREE", "ASEL");
        map.put("FIVE", "SUMAIR");
        System.out.println("HashMap After Replace :");

        Iterator<Map.Entry<String, String>> iterator2 = map.entrySet().iterator();
        while (iterator2.hasNext()) {
            Map.Entry<String, String> x = iterator2.next();
            System.out.println(x.getKey() + " : " + x.getValue());

        }
    }
}
