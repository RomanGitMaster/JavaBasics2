package com.syntax.class19;

public class DogTest {
    public static void main(String[] args) {
        Cat kitty=new Cat("Kat","white");
        kitty.display();//Cat class does not have this method but we are using inheritance from Animal class we can do it
        Dog dog=new Dog("Max","grey");
        dog.display();
    }
}
