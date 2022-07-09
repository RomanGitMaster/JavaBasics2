package com.syntax.class18;

public class HW5Students {
    //Write a java Class Students that have a constructor which takes students name and 3 subject grades.
    //Inside your class also have a method to Calculate Average Grade. Test Student class for 5 different students with
    //different marks. Your program should print an average mark of each students name.
    // NOTE: please use different names for instance and local variables.

    String student;
    int first;
    int mid;
    int fin;
    HW5Students(String student, int first, int mid, int fin) {
        this.student = student;
        this.first = first;
        this.mid = mid;
        this.fin = fin;
    }
    void averageGrade() {
        int average = (first + mid + fin) / 3;
        if (average >= 90) {
            System.out.println("Student " + student + " has average grade  A");
        } else if (average < 90 && average >= 80) {
            System.out.println("Student " + student + " has average grade  B");
        } else if (average < 80 && average >= 70) {
            System.out.println("Student " + student + " has average grade  C");
        } else if (average < 70 && average >= 60) {
            System.out.println("Student " + student + " has average grade  D");
        } else {
            System.out.println("Student " + student + " has average grade  F");
        }
    }
    public static void main(String[] args) {
        HW5Students s1 = new HW5Students("Jafar", 98, 97, 100);
        s1.averageGrade();
        HW5Students s2 = new HW5Students("Aladdin", 87, 100, 78);
        s2.averageGrade();
        HW5Students s3 = new HW5Students("Jasmine", 78, 80, 74);
        s3.averageGrade();
        HW5Students s4 = new HW5Students("Abu", 65, 70, 72);
        s4.averageGrade();
        HW5Students s5 = new HW5Students("Sultan", 52, 48, 60);
        s5.averageGrade();


    }
}

