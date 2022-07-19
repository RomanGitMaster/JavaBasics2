package com.syntax.class27;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo1 {
    public static void main(String[] args) {
        List<String>names=new LinkedList<>();//upcasting Linked list class  to List interface
        names.add("Aladdin");
        names.add("Abu");
        names.add("Jafar");
        names.add("Genie");
        System.out.println(names.size());
    }

}
