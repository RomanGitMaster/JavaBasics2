package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//FIGURE OUT WHERE IS THE PROBLEM
public class IteratorDemo {
    /*
boolean hasNext() – It returns true if iterator has more elements.

Object next() – It returns the element and moves the cursor pointer to the next element.

default void remove() – It removes the last elements returned by the iterator.

     */
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
//Note: Iteration can be done only once. If you reach the end of series it’s done. If we need to iterate again we should
// get a new Iterator.
        Iterator<String> iterator=names.iterator();
        while (iterator.hasNext());


        }
    }


