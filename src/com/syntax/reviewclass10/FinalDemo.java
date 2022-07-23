package com.syntax.reviewclass10;

public class FinalDemo {//declaring class finall prevents inheritance for other classes
    final String company;//even tho it is final variable and has to be initialized at declaration, constructor can do it-
    // since when we create object of a class constructors are being called first
    FinalDemo(String company){
        this.company=company;
    }
    void changeCompany(){
      //  company="facebook"; cannot reassign it because it is final and methods are not hte first thing called when object is being created
    }
}
/*class Child extends FinalDemo{

}

 */