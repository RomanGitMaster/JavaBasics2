package com.syntax.class27;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {
    public static void main(String[] args) {

        List<String> legends = new ArrayList<>();
        legends.add("Aladdin");
        legends.add("Abu");
        legends.add("Jafar");
        legends.add("Genie");
        System.out.println(legends.size());
        System.out.println(legends.isEmpty());
        System.out.println(legends.contains("Bahram"));
        System.out.println(legends.contains("aladdin"));
        Object[] arr = legends.toArray();
        System.out.println(arr[0]);
        System.out.println(legends);
        legends.remove("Jafar");
      System.out.println(legends);

      List<String>someStudents=new ArrayList<>();
      someStudents.add("Aladdin");
      someStudents.add("Abu");
      System.out.println(legends.containsAll(someStudents));// its a good method to check if subarralist has all elements of child arraylist

    }
}
