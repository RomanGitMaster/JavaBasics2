package com.syntax.class19;

public class HW2ClassA2 {
    //Write program to inherit class A that has method printF which is static and call or reuse that method into class B
    static String subject;
    static String teacher;
    public static void printF(){
         System.out.println(subject+" class will be led by "+teacher);
     }
}
class B2 extends HW2ClassA2{
    B2(String subject,String teacher){
        this.teacher=teacher;
        this.subject=subject;
        System.out.println("Today's we have someone special");
    }

    public static void main(String[] args) {
        B2 test=new B2("Math","Mr.Buckwell");
        //B2.printF();
        //test.printF();
        printF();
    }
}
