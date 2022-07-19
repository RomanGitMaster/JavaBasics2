package com.syntax.class26;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class HW5 {
    /*
    Create an arrayList of even numbers from 1 to 500. Remove any number that is divisible by 5 from that arrayList.
     */
    public static void main(String[] args) {
        LinkedList<Integer> evenNumbers = new LinkedList<>();
        for (int i = 2; i <= 500; i = i + 2) {
            evenNumbers.add(i);
        }
        System.out.println(evenNumbers);

        Iterator<Integer>iterator=evenNumbers.iterator();//<-----PREFERRED WAY WHILE WORKING WITH CHNGING SIZE OF LISTS
                                                         // but evn tho Lambda is preferred over iterator
        while(iterator.hasNext()){
            if(iterator.next()%5==0){
                iterator.remove();
            }
        }
        System.out.println(evenNumbers);
/*
        for (int i = 0; i < evenNumbers.size(); i++) {
            if (evenNumbers.get(i) % 5 == 0) {
                evenNumbers.remove(i);
            }
        }
        System.out.println(evenNumbers);



 */


    }

}
