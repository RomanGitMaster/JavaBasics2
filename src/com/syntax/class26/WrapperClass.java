package com.syntax.class26;

public class WrapperClass {
    public static void main(String[] args) {


        // wrapper class - provides a way to use primitive data types as reference data types
        //                 reference data types contain usuful methods( for example String (non primitive) is already a reference data types)
        //                 can be used with collections ( ex. ArrayLists )

        // most common ones:
        //primitive      // wrapper
        //--------       //---------
        //boolean        //Boolean
        //char           // Character
        //int            //Integer
        //double         // Double
// autoboxing - the automatic conversion that Java compiler makes between primitive types and their corresponding object wrapper classes
        // unboxing - the reverse of autoboxing. Automatic conversion of wrapper class primitive

        Integer i = new Integer(10);// example of BOXING, where we manually converting primitive into corresponding object of Wrapper Class
        Integer num = 10;// example of AUTOBOXING, where java automatically converts primitive data type to object ( reference data type)
        System.out.println(i);
        System.out.println(num);

        int i1=i.valueOf(i);// example of UNBOXING
        int num1=num;// example of AUTOUNBOXING

        System.out.println(i1);
        System.out.println(num1);


        Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;
        String e = "bro";


    }
}