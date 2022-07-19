package com.syntax.class26;

import java.util.ArrayList;

public class ArrayListDemoA {
    public static void main(String[] args) {
        //ArraysList -  resizable array. ArrayList is a class which implements the List interface of collection framework.

        //             -Elements can be added and removed after compilation phase.
        //             -Store  only reference data types(like String), with means  primitive data types won't work, and we will have
        //                to use appropriate object of  wrapper class (e.g. int ---> Integer, boolean--->Boolean, double--->Double
        //             -You can add and remove the elements from ArrayList and ArrayList will adjust its size automatically.
        //             -ArrayList can contain the duplicate elements.

        ArrayList<String> food=new ArrayList<>();
        food.add("Pizza");
        food.add("Hamburger");
        food.add("Hotdog");
        food.add("SHishKebab");
        food.add("Ragu");
        food.set(0,"Sushi");// we .set() method to set element at the specific index ,it is replacing the element if index
                           // is already occupied

        food.remove(2);// with .remove(index or object) we remove element by its index or by object that stored there
        food.indexOf("SHishKebab");//gives the index of the object "SHishKebab" in arraylist.
                                  // If the element is not found in the list then this method returns the value -1.

        System.out.println(food.get(0));// .get() method returns us the object(element) at specified index(0 in our case)



        //food.clear();// clears all elements out of the arraylist


        // we use for loop to print out elements in array list
        for (int i=0; i<food.size();i++){ // we use size() to know the length of array list and not length() like in array
            System.out.println(food.get(i));
        }











    }
}

