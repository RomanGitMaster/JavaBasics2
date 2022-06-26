package com.syntax.reviewclass08b;

import com.syntax.reviewclass08.Doctor;// in different package we need to import class( class Doctor in our case)

public class Hospital3 {
    public static void main(String[] args) {
        Doctor doc=new Doctor("John","Smith");
        //only public is visible in different package
        doc.printInfo();
        Doctor.study("Princeton");
    }
}
