package com.syntax.class26;
import  java.util.ArrayList;
public class ArrayListDemo {
    public static void main(String[] args) {


        String[] fruits = new String[4];//<---changed to [4]
        fruits[0] = "Mango";
        fruits[1] = "Apple";
        fruits[2] = "Pear";
        fruits[3] = "Watermelon";// we actualy have to change size of an Array if we want to add one element,
                                // which is fixed from [3]-->[4]
        System.out.println(fruits[1]);

        ArrayList fruitList = new ArrayList();
        fruitList.add("Mango");
        fruitList.add("Apple");
        fruitList.add("Pear");
        fruitList.add("Watermelon");// with arraylist we simply just adding, arraylist is more flexible

        fruitList.remove("Pear");// we can remove an element form an Arraylist
       //fruitList.clear();
        System.out.println(fruitList.contains("Pear"));
        System.out.println(fruitList);

    }
}