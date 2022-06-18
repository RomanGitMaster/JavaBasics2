package com.syntax.class15class16.class16;

public class Students {
    String name;
    int id;
    static int numOfStudents=15;
void printNumOfStudents(){
    System.out.println("Total number of all students is "+numOfStudents);
}
    public static void main(String[] args) {
    /*
Create a Class called Students
Create three  variables  Name , ID  and  numberOfStudents
Create three objects of the Students Class
Set the value for  studentName , studentID and increment  the numberOfStudents for each object
Print out  total number of students

     */
        Students st1=new Students();
        st1.name="Jack Sparrow";
        st1.id=3785;
        numOfStudents++;

        Students st2=new Students();
        st2.name="Black Beard";
        st2.id=3789;
        numOfStudents++;

        Students st3=new Students();
        st3.name="Black Sam Bellamy";
        st3.id=3765;
        numOfStudents++;

        System.out.println("Total number of students pirates is "+numOfStudents+". ARGGGHHHH!");
    }
}
