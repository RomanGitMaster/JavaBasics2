package com.syntax.class21;

public class HW4Pirates {
    private void pirates(){
        System.out.println("5 pirates on a deck");
    }
    private void pirates(String str){
        System.out.println("5 pirate on a deck "+" with "+str);
    }
    private void pirates(String str,String str1){
        System.out.println("5 pirate on a deck "+" with "+str+" and with "+str1);
    }

    public static void main(String[] args) {
        HW4Pirates md=new HW4Pirates();
        md.pirates("5 cannons","4 cutlasses");
        md.pirates();
        md.pirates("9 pistols");
    }
}
