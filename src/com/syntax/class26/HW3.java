package com.syntax.class26;

import java.util.ArrayList;

public class HW3 {
    /*
    Create an arrayList of words. Remove every word that ends with “e”.
     */
    public static void main(String[] args) {
        ArrayList<String>words=new ArrayList<>();
        words.add("I");
        words.add("love");
        words.add("Java");
        words.add("on");
        words.add("the");
        words.add("weekends");

        for (int i=0;i<words.size();i++){
            if(words.get(i).endsWith("e")){
                words.remove(i);
            }
            System.out.println(words.get(i));

        }


    }
}
