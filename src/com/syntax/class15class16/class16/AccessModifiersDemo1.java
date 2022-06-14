package com.syntax.class15class16.class16;

public class AccessModifiersDemo1 {
    private String password="pass123";//<---- only be accessed in this specific class
    int ssn=1234567;
    public String name="Karla";


    public static void main(String[] args) {
        AccessModifiersDemo1 ac=new AccessModifiersDemo1();
        System.out.println(ac.password);
        System.out.println(ac.ssn);
        System.out.println(ac.name);



    }
}