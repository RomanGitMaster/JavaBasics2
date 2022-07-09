package com.syntax.class26;

import java.util.ArrayList;

public class Demo2 {
    public static void main(String[] args) {
        ArrayList<Character>arrayList=new ArrayList<>();
        arrayList.add('A');// adds the element(char) to an arraylist
        arrayList.add('B');
        arrayList.add('C');
        arrayList.add('D');
        arrayList.add('E');
        System.out.println(arrayList);
        System.out.println(arrayList.get(2));// gets back the elments from the arraylist by index

        for(int i=0;i<arrayList.size();i++){// printing out the elements (chars) from arraylist ususing for loop
            System.out.println(arrayList.get(i));
        }



    }
}
