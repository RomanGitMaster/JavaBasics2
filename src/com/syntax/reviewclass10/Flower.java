package com.syntax.reviewclass10;

public class Flower {
    String color;
    Flower(String color){
        this.color=color;// we can use this keyword to distinguish a local from instance variable
    }
    void showColor(){
        System.out.println("Flowers have abeautiful colors");
    }
    void smell(){
        System.out.println("Flowers smell very good");
    }
    void bloom(){
        System.out.println("Generaly bloom in spring");
    }
}
class Rose extends Flower{
    Rose(String color) {
        super(color);//we can use super keyword to call  a constructor of parent class
    }
void thorns(){
    System.out.println("Be careful - thorns");// since this method is not overriden ,it present only in this class it
    // cannot be called in way of Flower f=new Rose("red"); f.thorns();  since its not avaible to Flower class even tho Rose is a Child class

}
    @Override
    void showColor() {
        System.out.println("Roses have "+color+" color");
    }
     @Override
    void bloom() {
        System.out.println("Generaly bloom in April");
    }
}
class Tulips extends Flower{

    Tulips(String color) {
        super(color);
    }

    @Override
    void showColor() {
        System.out.println("Tulips have "+color+" color");
    }
}
