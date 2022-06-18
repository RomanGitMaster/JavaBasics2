package com.syntax.class17;

import com.syntax.class15class16.class16.Access1;

public class Access3 extends Access1{// "extends" means Access3 is related to Access1
    public static void main(String[] args) {
        Access3 a = new Access3();//but in order to get access with protected we need to create object of the current class
                                  // which is Access3 instead of Access1
        System.out.println(a.getHours());
        System.out.println(a.minutes);




    }
}