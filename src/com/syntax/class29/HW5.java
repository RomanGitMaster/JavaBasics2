package com.syntax.class29;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HW5 {
    /*
    Create a Map that will store Employee name and salary. Write a logic to retrieve an employee who gets the highest salary. Output should be in the below format
John Smith=$100000
     */
    public static void main(String[] args) {
        HashMap<String,Integer>employee=new HashMap<>();
        employee.put("Jack Salivan",120000);
        employee.put("Biggy Dayne",65000);
        employee.put("Elisa Bro",200000);
        employee.put("Sameer Theman",250000);
        Integer max2 = 0;
        String max1="";

        //for(Map.Entry<String,Integer>entry:employee.entrySet()){}
        Set<Map.Entry<String,Integer>> entries=employee.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {

            if(entry.getValue()>max2) {
                max2 = entry.getValue();
                max1= entry.getKey();

            }
            
        }
        System.out.println(max1+" $"+max2);


    }
}
