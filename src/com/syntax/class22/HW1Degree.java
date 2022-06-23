package com.syntax.class22;

public class HW1Degree {
    /*
Create a class 'Degree' having a method 'getPrerequisite' that prints ""To get a degree you need high school diploma"".
Class 'Degree' has 2 subclasses namely 'Bachelors' and Masters’. In Masters class override method 'getPrerequisite'.
Call the method by creating an object of each of the three classes.
     */
    void getPrerequisite(){
        System.out.println("To get a degree you need high school diploma");
    }

}
class Bachelors extends HW1Degree{

}
class Masters extends HW1Degree{
    @Override
    void getPrerequisite(){
        System.out.println("To get a degree you need high school diploma and 5 years of hard work in college");
    }
}
class Test{
    public static void main(String[] args) {
        HW1Degree degree=new HW1Degree();
        degree.getPrerequisite();
        Bachelors bachelors=new Bachelors();
        bachelors.getPrerequisite();
        Masters masters=new Masters();
        masters.getPrerequisite();
    }
}