package com.syntax.reviewclass07;

public class B13StringTester {

    public static void main(String[] args) {
        B13String str=new B13String("abcsssesd");
        str.countChars('s');
        System.out.println( str.countChars('s'));
        str.printCharts('a');
    }
}
