package com.syntax.class26;

public interface MoveAble {
     void move() ;


}
class Car implements MoveAble{

    @Override
    public void move() {
        System.out.println("A car can move");
    }
    public void park(){
        System.out.println("you can park me");
    }
}
class Person implements MoveAble{

    @Override
    public void move() {
        System.out.println("Humans can also move");
    }
}
class Test{
    public static void main(String[] args) {
        MoveAble moveAble=new Car();//widening casting
        moveAble.move();
        //moveAble.park(); special method of Car is not interface method so MoveAble interface  cannot reach it
         ((Car) moveAble).park();// narrowing casting
        MoveAble[] moveAbles={new Car(),new Person()};



    }
}