package com.syntax.class29;

// examples of removing elements from arraylist
import java.util.ArrayList;
import java.util.LinkedHashSet;

public class SetDemo1 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();// to add data type Integer in second angle brackets is not necessary,
                                                    // since its referred automatically
        nums.add(10);
        nums.add(20);
        nums.add(20);
        nums.add(10);
        nums.add(40);

        //when we pass the list to the constructor of the Set and java will create a set out of that list using same
        // approach we get a list back from the Set
        nums=new ArrayList<>(new LinkedHashSet<>(nums)); // <--way convert Arraylist to LinkHashSet in order to remove duplicates

       /* LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();//<-- longer approach but more understandable
       linkedHashSet.addAll(nums); // just adding elemnets fro arraylisto to hashset
        //System.out.println(linkedHashSet);
        nums = new ArrayList<>();//creating new array
        nums.addAll(linkedHashSet);
        System.out.println(nums);// adding unique elements ( we got them through filtering of LinkedHashSet)

        */


    }
}
