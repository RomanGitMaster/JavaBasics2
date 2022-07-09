package com.syntax.class26;

import java.util.ArrayList;

public class Demo4 {
    public static void main(String[] args) {
        ArrayList<String>names=new ArrayList<>();
        names.add("Zameer");
        names.add("Kevin");
        names.add("Ahmad");
        names.add("Kat");
        System.out.println(names);
        names.remove("Kevin");// removing specific string from arraylist
        System.out.println(names);
        names.add("Kevin");
        System.out.println(names);
        names.remove(3);//removing element (String) by using index
        System.out.println(names);


    }
}
