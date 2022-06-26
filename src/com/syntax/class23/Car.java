package com.syntax.class23;

public class Car {
    void start(){
        System.out.println("Use key to start car");
    }
    void stop(){
        System.out.println("Use break to stop car");
    }
    void park(){
        System.out.println("You can park car manually");
    }
}
class BMW extends Car{
    @Override
    void start() {
        System.out.println(" you can use start button to start a car");
    }

    @Override
    void stop() {
        System.out.println("You can use system to auto break");
    }

}
class Tesla extends Car{
    @Override
    void start() {
        System.out.println("you can start car from app");
    }

    @Override
    void stop() {
        System.out.println("you can use auto breaking system to stop");
    }

    @Override
    void park() {
        System.out.println("you can use auto park system to park");
    }
}
class Toyota extends Car{

}
class CarTester{
    public static void main(String[] args) {
      /*  Car car=new Tesla();//<---- we can do this, we can store object of child class in parent class if it overrides it
        car=new Toyota();// its just resigning , shortcut not ot retype info
        car.start();

       */
        /*BMW bmw=new BMW();
        bmw.start();
        bmw.stop();
        bmw.park();
        Tesla tesla=new Tesla();
        tesla.start();
        tesla.stop();
        tesla.park();
        Toyota toyota=new Toyota();
        toyota.start();
        toyota.stop();
        toyota.park();
*/
        Car car=new BMW();//<--- if we execute the same method on different class just replace Car to BMW, or to TESLA and so on
        car.start();
        car.stop();
        car.park();
        Car[]cars={new BMW(),new Tesla(),new Toyota()};// we can store object of a child classes in parent and can write a loop to display all methods
        for (Car c:cars){
            c.start();
            c.stop();
            c.park();
        }
    }
}
