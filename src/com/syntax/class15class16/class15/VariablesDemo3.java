package com.syntax.class15class16.class15;

public class VariablesDemo3 {
    static int num=5;// stays same for all the objects
    String name;

    public static void main(String[] args) {

        VariablesDemo3 v1=new VariablesDemo3();
        v1.name="Cpt Naveed";
        VariablesDemo3 v2=new VariablesDemo3();
        v2.name="Jason";
        VariablesDemo3 v3=new VariablesDemo3();
        v3.name="Mumtaz";
        VariablesDemo3 v4=new VariablesDemo3();
//before resigning

        System.out.println(v1.name);
        System.out.println(v1.num);
//after resigning
        v1.num=10;
        v1.name="Sameer";

        System.out.println(v2.name);
        System.out.println(v2.num);
        System.out.println(v1.name);

    }
}


