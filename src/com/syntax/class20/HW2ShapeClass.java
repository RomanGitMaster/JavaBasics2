package com.syntax.class20;

public class HW2ShapeClass {
    /*
    Write program: Shape class has a constructor that takes the radius and has a subclass as  circle class.
    In circle class create a method to calculate the area of circle. Test your code
     */
    double radius;

    HW2ShapeClass(double radius) {
        this.radius = radius;
    }

}

class Circle extends HW2ShapeClass {
    Circle(double radius) {
        super(radius);
    }
    /*
     void circleArea(){
     double area=3.14*(radius*radius);
     System.out.println("Area of the circle with radius "+radius+" is "+area);
     }
     */

    double circleArea() {
        double area = 3.14 * (radius * radius);

        return area;

    }
}

class Test {
    public static void main(String[] args) {
        Circle test = new Circle(10);
        //test.circleArea();
        System.out.println("Area of the circle is " + test.circleArea());
    }
}