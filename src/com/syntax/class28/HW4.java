package com.syntax.class28;

import java.util.HashSet;

public class HW4 {
    /*
    Create a Set collection that will hold Objects of Student Type. In this set we do not care about the insertion
    order. Each student object should have name and studentID. Display name of each student.
     */
}
   //According to Task this is the first solution
    class Student{
        String name;
        int id;
        Student(String name,int id){
            this.name=name;
            this.id=id;
        }

        void display(){
            System.out.println("Student name and id are: "+name+" "+id);
        }

    public static void main(String[] args) {
        Student[] sts = {new Student("Jerry", 12345), new Student("Daniel", 98765), new Student("Creg", 54678)};
        HashSet<Student>students=new HashSet<>(3);
        for(Student st:sts){
            students.add(st);
        }
        for (Student student:students){
            student.display();
        }

        //SECOND SOLUTION

    }
}