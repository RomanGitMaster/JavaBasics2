package com.syntax.class28;

public class ListDemo {
    public static void main(String[] args) {
        Object[] arr={"Hamid",10.2,"name"};//bad programming

        for (Object obj:arr){
            if(obj instanceof String)// instanceof keyword checks if variable contains specific type of object
                System.out.println(((String)obj).length());// length() is only method that works for String
        }
    }
}
