package com.syntax.class18;

public class HW3 {
//Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
// Method should be available inside the class only where it was declared and executed by calling it is name.


private static String onlyVowels(String str) {
    String vowels = "";
    for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'u' || str.charAt(i) == 'i' || str.charAt(i) == 'o'){
            vowels += str.charAt(i);
        }

    }
    //or return str.replaceAll("[^aeiou]", "");
    return vowels;
}
    public static void main(String[] args) {

        System.out.println(onlyVowels("abrakadabra alakazam"));

    }

}
