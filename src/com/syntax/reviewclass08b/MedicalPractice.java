package com.syntax.reviewclass08b;

import com.syntax.reviewclass08.Doctor;

public class MedicalPractice extends Doctor {
    MedicalPractice(String firstName, String lastName){
        super(firstName,lastName); // by using keyword super we are Calling( not initializing) the super(parent) class constructor
                                  // that must initialize parent class variables first, and we specify what variables IF constructor in parent class has parameters
    }
    public static void main(String[] args) {

    }
}
