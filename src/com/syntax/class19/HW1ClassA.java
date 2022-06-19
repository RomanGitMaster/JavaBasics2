package com.syntax.class19;

class HW1ClassA {
    //Write program for multilevel inheritance where class C inherits from class B and Class B inherits from Class A.
    int students;
    String day;
    String teacher;
    String subject;
    public void printInfo () {
        System.out.println("Today is "+day);

    }
}

class B extends HW1ClassA {
   B(int students,String teacher, String subject,String day){
       this.students=students;
       this.teacher=teacher;
       this.subject=subject;
       this.day=day;
   }

    public void teaching() {
        System.out.println("In today's class where are " + students + " is teaching " + teacher);
    }
}

class C extends B {


    C(int students, String teacher, String subject,String day) {
        super(students, teacher, subject, day);
    }

    public void subjectStudying() {
        System.out.println("Today's subject " + subject);

    }
}

class Test {
    public static void main(String[] args) {

        B group= new B(28,"Mr.Buckwell","Math", "Wednesday");
      group.printInfo();
      group.teaching();

        C group2=new C(28,"Ms.Elsa","Literature","Friday");
       group2.printInfo();
       group2.subjectStudying();
       group2.teaching();

    }
}





