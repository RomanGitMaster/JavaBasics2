package com.syntax.class19;

public class Teacher {
    //Write a Java program called Teacher.  Identify features and behaviour of that Class. Create 3 subclasses
    // MathTeacher, ChemistryTeacher and PianoTeacher that would have it their own features and behaviour. Test all 4 classes

    String name;
    String quality;
    int age;
    String subject;
    String studentsRate;

    void printInfo() {
        System.out.println(subject + " teacher's name is " + name + " and he is " + age + ". But all students  " + studentsRate + " because he is " + quality);

    }
}

class MathTeacher extends Teacher {

    MathTeacher(String name, String subject, int age, String studentsRate, String quality) {
        this.name = name;
        this.subject = subject;
        this.age = age;
        this.studentsRate = studentsRate;
        this.quality=quality;

    }

    void behavior() {
        System.out.println(name+" falls asleep during class");

    }
}

class ChemistryTeacher extends Teacher {
    String weirdThing;

    ChemistryTeacher(String name, String subject, int age, String studentsRate, String quality,String weirdThing) {
        this.name = name;
        this.subject = subject;
        this.age = age;
        this.studentsRate = studentsRate;
        this.quality=quality;
        this.weirdThing = weirdThing;

    }
    void behavior1(){
        System.out.println(name+" sometimes looks back and " + weirdThing);
    }
}

class PianoTeacher extends Teacher {
    String season;

    PianoTeacher(String name, String subject, int age, String studentsRate,String quality) {
        this.name = name;
        this.subject = subject;
        this.age = age;
        this.studentsRate = studentsRate;
        this.quality=quality;

    }

  void  behavior2(String season) {

        if (season.equalsIgnoreCase("Spring")) {
            System.out.println(name+" sneezes all the time");
        } else {
            System.out.println(name+" always smiling");
        }

    }
}

class TeacherTest {
    public static void main(String[] args) {
        MathTeacher t1 = new MathTeacher("Mr.Dankir", "Math", 64, "love the teacher", "very kind");
        t1.printInfo();
        t1.behavior();
        ChemistryTeacher t2 = new ChemistryTeacher("Mr. Aizendorf", "Chemistry", 48, "don't like the teacher", "weird", "talks to himself");
        t2.printInfo();
        t2.behavior1();
        PianoTeacher t3=new PianoTeacher("Mr.Sadkovki","Piano",38,"like the teacher","friendly");
        t3.behavior2("Summer");

        t3.printInfo();
    }
}