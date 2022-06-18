package com.syntax.class17;

public class TeacherClass {
    public static void main(String[] args) {
        Teacher teacher=new Teacher();
    teacher.name="Zombie";
    teacher.schoolName="Marvard";
    teacher.printInfo();//<== we can access everything through the void because method void printInfo declared public,
        // even if salary is private - INDIRECT ACCESS

    }
}
