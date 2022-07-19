package com.syntax.class28;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("hope");
        words.add("play");
        words.add("come");
        words.add("frame");
        words.add("game");

        words.removeIf((String nat) -> nat.endsWith("e"));// another way of writing without a loops
        System.out.println(words);

// never use simple for loops or Enhanced for loop or while loop whenever you are planning to use any method that can change the size of a list
       /* for (int i=0;i<words.size();i++){
            if(words.get(i).endsWith("e")){
                words.remove(i);
            }
            System.out.println(words.get(i));
        }

        */

        //Iterator<String> iterator = words.iterator();// then we call a method that will return the object
        //System.out.println(iterator.hasNext());// hasNext will returns true if there is next element inside the iterator
        // but when it reaches the end of elements it stops iterating
        // System.out.println(iterator.next());// 2 things:
        // 1) moves the pointer to next location by one;
        // 2) returns the element at that position

        //System.out.println(iterator.hasNext());
        //System.out.println(iterator.next());
        //System.out.println(iterator.hasNext());// no elements left
        //System.out.println(iterator.next()); error will occur since we cannot get next element

       /*
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            if(iterator.next().endsWith("e")){
                iterator.remove();

            }
        }
        System.out.println(words);// right way to work with List collections if we are planning to use methods that change the size of the List
                */
    }
}
