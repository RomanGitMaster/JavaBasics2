package com.syntax.class23;

public class HW {
    /*
Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
Define common behavior within parent class and override some of the methods in child classes
Define some methods specific to child classes
Write example of achieving run time polymorphism

     */
}

class Student {
    void write() {
        System.out.println("students are writing");
    }

    void read() {
        System.out.println("students are reading");
    }

    void exercise() {
        System.out.println("students are exercising");
    }
}

class SyntaxStudent extends Student {
    @Override
    void write() {
        System.out.println("students are writing code");
    }

    @Override
    void read() {
        System.out.println("students are reading code during the class and slides after the class");
    }

    @Override
    void exercise() {
        System.out.println("students are exercising with replit and homework tasks");
    }
}

class CollegeStudent extends Student {
    @Override
    void write() {
        System.out.println("students are writing essays a lot");
    }

    @Override
    void read() {
        System.out.println("students are reading a lot of books");
    }

    @Override
    void exercise() {
        System.out.println("students are exercising in a college gym from time to time");
    }
}

class SchoolStudent extends Student {
    @Override
    void write() {
        System.out.println("students are writing some home work ");
    }

    @Override
    void read() {
        System.out.println("students are reading books");
    }

    @Override
    void exercise() {
        System.out.println("students are exercising during gym class");
    }
}

class StudentsTester {
    public static void main(String[] args) {
        Student st = new SyntaxStudent();//CollegeStudent,SchoolStudent
        st.read();
        st.write();
        st.exercise();
        Student[] students = {new SyntaxStudent(), new CollegeStudent(), new SchoolStudent()};


        for (int i = 0; i < students.length; i++) {
        students[i].read();
        students[i].write();
        students[i].exercise();
        }

        /*for(Student student:students){
            student.read();
            student.write();
            student.exercise();
        }

         */
    }
}
