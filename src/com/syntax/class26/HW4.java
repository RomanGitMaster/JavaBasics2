package com.syntax.class26;

import java.util.ArrayList;

public class HW4 {
    /*
    Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.
     */
    public static void main(String[] args) {
        ArrayList<String>drinks=new ArrayList<>();
        drinks.add("Tequila");
        drinks.add("Whiskey");
        drinks.add("Vodka");
        drinks.add("Konjac");

        for(int i=0;i<drinks.size();i++){
            if(drinks.get(i).contains("a")||drinks.get(i).contains("e")){
                drinks.set(i,"Water");
            }
            System.out.println(drinks.get(i));
        }
        System.out.println("FEELS LIKE I WILL BE SOBER ALL YEAR LONG!LOL");
    }
}
