package com.syntax.class18;

public class HW1 {
//Create a method that will accept an array as parameters and will return a sum of all elements from that array.
// Method should be visibly only within same package and accessible by the creating an instance of the class.
//
    int arrSum(String[] arr) {
        int sumEl = 0;
        for (int i = 0; i < arr.length; i++) {
            sumEl += 1;
        }
        return sumEl;
    }

    public static void main(String[] args) {
        String[] arr = {"white", "blue", "yellow", "red", "brown"};
        HW1 md = new HW1();
        int sum=md.arrSum(arr);
        System.out.println(sum);
    }
}
