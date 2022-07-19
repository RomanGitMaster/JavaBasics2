package com.syntax.class28;

import java.util.HashSet;
import java.util.Iterator;
/*
 -boolean add(Element  e): It adds the element e to the list.
 -void clear(): It removes all the elements from the list.
 -boolean contains(Object o): It checks whether the specified Object o is present in the list or not. If the object has
  been found it returns true else false.
 -boolean isEmpty(): Returns true if there is no element present in the Set.
 -Iterator iterator(): Used to return an iterator over the element in the set.
 -int size(): It gives the number of elements of a Set.
 -Boolean remove (Object o): It removes the specified Object from the Set.
- Object clone(): This method returns a shallow copy of the HashSet.
 */

public class SetDemo {
    public static void main(String[] args) {
        HashSet<String> fruit = new HashSet<>();
        fruit.add("mango");
        fruit.add("apple");
        fruit.add("orange");
        fruit.add("banana");
        fruit.add("orange");// it doesn't allow duplicates in HashSet, so it won't be displayed
        fruit.add(null);// allows null elements
        fruit.add(null);// allows null element but this one is duplicate, so it is excluded
        System.out.println(fruit);
        System.out.println("---------------------------------------------------------------------------------------");

        HashSet<String> hset = new HashSet<String>();
        // Adding elements to the HashSet
        hset.add("Apple");
        hset.add("Mango");
        hset.add("Grapes");
        hset.add("Orange");
        hset.add("Fig");
        //Addition of duplicate elements
        hset.add("Apple");
        hset.add("Mango");
        //Addition of null values
        hset.add(null);
        hset.add(null);
        //Displaying HashSet elements
        System.out.println(hset);

        Iterator<String> it = hset.iterator();//iterating and printing out hset
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }

    }
}
