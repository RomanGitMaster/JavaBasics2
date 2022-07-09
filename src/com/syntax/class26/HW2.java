package com.syntax.class26;

import java.util.ArrayList;

public class HW2 {
    /*
    Create an arraylist of cars and retrieve all the values using 3 different ways.
     */
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Honda");
        cars.add("Suzuki");
        cars.add("Toyota");
        cars.add("Subaru");
        cars.add("Infinity");
        cars.add("Nissan");
        System.out.println("cars = " + cars);
        System.out.println("--------------------------------------------------------------------");
        for (String car : cars) {
            System.out.println(car);
        }
        System.out.println("--------------------------------------------------------------------");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
    }
}

