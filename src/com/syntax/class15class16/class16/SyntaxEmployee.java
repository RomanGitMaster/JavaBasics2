package com.syntax.class15class16.class16;

public class SyntaxEmployee {
    int empID;
    int salary;
   static String ceo="Samair";
    void showInfo(){
        System.out.println("Employee with ID number "+empID+ " has salary of "+salary+" and with "+ceo+" as CEO");
    }
    public static void main(String[] args) {
        SyntaxEmployee emp1=new SyntaxEmployee();
        emp1.empID=1234;
        emp1.salary=158000;

        SyntaxEmployee emp2=new SyntaxEmployee();
        emp2.empID=1235;
        emp2.salary=168000;

        SyntaxEmployee emp3=new SyntaxEmployee();
        emp3.empID=1236;
        emp3.salary=159000;

        emp2.showInfo();
        emp1.showInfo();
        emp3.showInfo();
    }
}
