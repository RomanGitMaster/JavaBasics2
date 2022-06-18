package com.syntax.class17;

public class Dog {
    String name;
    String breed;
    String color;
    int age;
    double weight;

    //How we set up constructor for use:
Dog(String dogName,String dogBreed,String dogColor, int dogAge, double dogWeight){
    name=dogName;
    breed=dogBreed;
    color=dogColor;
    age=dogAge;
    weight=dogWeight;
    if(dogAge>0&& dogAge<25){
        age=dogAge;
    }else{
        System.out.println("dog cant be of that age");

    }
}
    void printInfo(){
        System.out.println("Name "+name+" Breed "+breed+" color "+color+" age "+age+" weight "+weight);
    }
/* we use constructor to avoid hardcoding
public static void main(String[] args) {
        Dog dog1=new Dog();
        dog1.name="Locky";
        dog1.breed="German";
        dog1.color="Black";
        dog1.age=15;
        dog1.weight=26.05;
        dog1.printInfo();

        Dog dog2=new Dog();
        dog2.name="ky";
        dog2.breed="Shepard";
        dog2.color="White";
        dog2.age=11;
        dog2.weight=20.05;
        dog2.printInfo();
 */
public static void main(String[] args) {
    Dog dog1=new Dog("Puffy","Buldog","grey",6,18.65);
    dog1.printInfo();
}
    }

