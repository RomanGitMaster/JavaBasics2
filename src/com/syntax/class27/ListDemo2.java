package com.syntax.class27;

import java.util.ArrayList;
import java.util.List;

public class ListDemo2 {
    public static void main(String[] args) {
        ArrayList<String> legends = new ArrayList<>();//recommended
        legends.add("Aladdin");
        legends.add("Abu");
        legends.add("Jafar");
        legends.add("Genie");
        ArrayList<String>moreStudents=new ArrayList<>();
        moreStudents.add("Jasmine");
        moreStudents.add("Raja");

        ArrayList<String>allStudents=new ArrayList<>();
        allStudents.addAll(legends);
        allStudents.addAll(moreStudents);
        System.out.println(allStudents);
        allStudents.removeAll(legends); //opposite to addAll method
        System.out.println(allStudents);

        allStudents.clear();// clears all elements from allStudents arraylist
        System.out.println(allStudents);
    }
}
