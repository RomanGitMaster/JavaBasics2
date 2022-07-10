package com.syntax.class27;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
//Example of how we can check the difference between ArrayList and LinkedList
public class ArrayListVsLinkedList {
    public static void main(String[] args) {
        List<String>names=new LinkedList<>();// try Array list instead of LinkedList- and see the difference
                                             // IF WE PROVIDE CAPACITY FROM THE BEGINNING IT WILL MAKE CODE FASTER SINCE
        // jAVA WONT TRIGGER EXTRA BLOCK OF CODE INSIDE OF A CLASS THAT IMPLEMENTS IN CLASS WE ARE USING  E.G
        //ArrayList<String>names=new ArrayList<>(15);// <--- so we provided that capacity

        long startTime=System.currentTimeMillis();
        for (int i=0;i<1000000;i++){
            names.add(0,"captain Naveed");
        }
        long endTime=System.currentTimeMillis();
        System.out.println(endTime-startTime);
    }
}
