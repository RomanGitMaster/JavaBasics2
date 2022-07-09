package com.syntax.class26;

import java.util.ArrayList;

public class Demo9 {//playing with integer methods
    public static void main(String[] args) {
        Integer num=10;
        System.out.println(Integer.MAX_VALUE);
        int num1=Integer.parseInt("20");// if the number is present in a form a string using this method we can convert
                                          // to original type
        System.out.println(num1);
        System.out.println(Integer.MIN_VALUE);
        int number=15;
        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.add(number);//autoboxing from pritive to noprimitive
        System.out.println("numbers = " + numbers);
        int number1=numbers.get(0);//auto unboxing , from nonpritive to primitve
        new Integer(15); //boxing

    }
}
