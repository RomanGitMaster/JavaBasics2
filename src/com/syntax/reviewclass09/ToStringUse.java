package com.syntax.reviewclass09;

public class ToStringUse {


}
class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;

    }

    /*

        @Override // automatic generation of toString() with all parameters of the object
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';

     */
    public String toString() {// manual overrriding of toString method that being pulled from java.lang->Object
        return name + " " + age;

    }
}
class TetsingToStringUse{
    public static void main(String[] args) {
        Student s1=new Student("Jack",30);
        Student s2=new Student("Rose",22);
        System.out.println(s1);
        System.out.println(s2);
    }
}

