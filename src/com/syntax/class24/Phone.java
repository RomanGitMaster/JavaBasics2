package com.syntax.class24;

public abstract class Phone {
    abstract  void displayPictures();//<---just providing the interface
    abstract  void unlock();// ass soon as one of the methods is abstract the current class has to be abstract
                            // if method doesn't have ABSTRACT then it must have body of a code
}
class Iphone extends Phone {// abstract methods have to be implemented in child class if it is inherited from parent
                           // abstract class
    @Override
    void displayPictures(){ //<---- and here we are implementing that interface
        System.out.println("Use photos app to display pictures");
    }

    @Override
    void unlock() {
        System.out.println("Face Id to unlock the phone");
    }
}
//abstract class Samsung extends Phone{ // <---- we cannot create object of abstract class
class Samsung extends Phone {
    @Override
    void displayPictures() {
        System.out.println("Using Galleries to display photos");
    }

    @Override
    void unlock() {
        System.out.println("User finger prints sensor or face unlock to unlock your phone");
    }

}
    class Tester{
    public static void main(String[] args) {
       // Samsung samsung=new Samsung();//'Samsung' is abstract; cannot be instantiated

Samsung phone=new Samsung();
phone.displayPictures();
phone.unlock();
    }
}
