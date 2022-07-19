package com.syntax.class29;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionDemo {
    public static void main(String[] args) {
       // List<String>list=new ArrayList<>();// Where List is parent of class Arraylist(which implements methods of List Interface),
        // so we can store object of that class inside a variable of type interface.
        Collection<String> list=new ArrayList<>();// Where Collection is a grandparent of class Arraylist, which means
                                                 // just like with the List(which inherits from Collection) we can store
                                                 // the ArrayList class in Collection Interface.

        list.add("Aladdin");

    }
}
