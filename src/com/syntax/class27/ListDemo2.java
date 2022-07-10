package com.syntax.class27;

import java.util.ArrayList;
import java.util.List;

public class ListDemo2 {
    public static void main(String[] args) {
        List<String> legends = new ArrayList<>();
        legends.add("Aladdin");
        legends.add("Abu");
        legends.add("Jafar");
        legends.add("Genie");
        ArrayList<String>moreStudents=new ArrayList<>();
        moreStudents.add("Jasmine");
        moreStudents.add("Raja");

        ArrayList<String>allStudents=new ArrayList<>();
        allStudents.addAll(legends);// opposite to addAll
        allStudents.addAll(moreStudents);
        System.out.println(allStudents);

        allStudents.clear();// clears all elements from allStudents arraylist
        System.out.println(allStudents);
    }
}
