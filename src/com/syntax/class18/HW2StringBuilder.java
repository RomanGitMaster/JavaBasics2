package com.syntax.class18;

public class HW2StringBuilder {
    //Create a method that will take a String as a parameter and returns reversed String. Method should be available to
    // all classes within your project and accessible by class name.


    //public static String reverseString(String str){           <-----another way
    // return new StringBuilder(str)().toString();
    //}
public static String rrs(String str){

   StringBuilder str1=new StringBuilder(str);
      String str2= String.valueOf(str1.reverse());
      return str2;
    }

    public static void main(String[] args) {
        System.out.println(rrs("babahalamaha"));//<--- or we can call by class name sout(HW2.rrs("babahalamaha"));
    }
}




