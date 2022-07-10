package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//FIGURE OUT WHERE IS THE PROBLEM
public class IteratorDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Bro");
        names.add("Bro2");
        names.add("Bro3");
        names.add("Bro4");
/*
        for (String name : names) {
            if (name.contains("B")) {
                names.remove(name);
            }
        }
         */

        Iterator<String> iterator=names.iterator();
        while (iterator.hasNext());


        }
    }


