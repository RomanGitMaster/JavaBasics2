package com.syntax.class18;

public class HW8Student {
    //Write a Student class  that have instance variables name and address. Create a constructor that will initialize
    // those variables. Print name & address of given  student using displayInfo method.
    String name;
    String address;
    HW8Student(String name,String address){
        this.name=name;
        this.address=address;
    }
    void displayInfo(){
        System.out.println("Student "+name+" lives by address "+address);
    }
    public static void main(String[] args) {
        HW8Student st1=new HW8Student("Ali Ababua","Sahara Desert, Cave of Wonders 1");
        st1.displayInfo();
        //new HW8Student("Ali Ababua","Sahara Desert, Cave of Wonders 1").displayInfo();
    }
}
