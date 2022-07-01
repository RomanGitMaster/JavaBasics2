package Replit;

public class Replit166 {
}
class Animal{
    String animal;


    Animal(String animal){
        this.animal=animal;

    }
    void eat(){
        System.out.println(animal+" eats");

    }
    void sleep(){
        System.out.println(animal+" sleeps");
    }

}
class Cat extends Animal {
    Cat(String animal) {
        super(animal);
    }

    @Override
    void sleep() {
        System.out.println(animal + " sleeps a lot");
    }
}
class Kitten1 extends Cat {
    Kitten1(String animal) {
        super(animal);
    }

    @Override
    void eat() {
        System.out.println(animal + " eats milk");

    }
}
class Kitten2 extends Cat {
    Kitten2(String animal) {
        super(animal);
    }

    @Override
    void eat() {
        System.out.println(animal + " eats snacks");

    }
}
class Kitten3 extends Cat {
    Kitten3(String animal) {
        super(animal);
    }

    @Override
    void eat() {
        System.out.println(animal + " eats everything");

    }
}
class CatTester {
    public static void main(String[] args) {
        Cat[] cats={new Cat("Cat"),new Kitten1("kitten1"),new Kitten2("kitten2"),new Kitten3("kitten3")};
        for (Cat cat:cats){
            cat.eat();
            cat.sleep();
        }

    }
}


