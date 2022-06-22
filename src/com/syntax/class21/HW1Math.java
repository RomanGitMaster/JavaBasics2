package com.syntax.class21;

import com.syntax.class18.HW1;

public class HW1Math {
    /*TASK1 AND TASK3
 Create 1 class in which create a methods that will calculate the area (volume in case of box) of
Rectangle
Square
Box
Use separate class to test your code
     */
    static void area(int l){
        System.out.println("Area of the squere is "+(l*l));
    }
    static void area(int l,int w){
        System.out.println("Area of the rectangle is "+(l*w));
    }
   static void area(int l,int w, int h){
        System.out.println("Area of the box is "+(2*l*w+2*l*h+2*w*h));
    }

}
class MathTest{
    public static void main(String[] args) {

        HW1Math.area(5);
        HW1Math.area(5,5,5);
        HW1Math.area(5,7);
    }
}
