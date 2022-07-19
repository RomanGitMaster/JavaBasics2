package com.syntax.class28;

import java.util.ArrayList;

public class ListDemo2 {
    public static void main(String[] args) {
        ArrayList<Flower>flowers=new ArrayList<>();
        flowers.add(new Rose());
        flowers.add(new Lilly());
        flowers.add(new Flower());//we can add it too

        for (Flower flower:flowers){
            flower.bloom();
        }
    }
}
class Flower{
    void bloom(){
        System.out.println("generally flower in the spring");
    }
}
class Rose extends Flower{
    @Override
    void bloom(){
        System.out.println("bloom in April");
    }
}
class Lilly extends Flower{
    @Override
    void bloom(){
        System.out.println("bloom in summer");
    }
}