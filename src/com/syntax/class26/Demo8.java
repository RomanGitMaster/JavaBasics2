package com.syntax.class26;

import java.util.ArrayList;

public class Demo8 {

    // addAll(arraylist name) to add all ellements from another arraylist
    public static void main(String[] args) {


        ArrayList<String> subjectsSeen = new ArrayList<>();
        subjectsSeen.add("SDLC");
        subjectsSeen.add("Manual Testing");
        subjectsSeen.add("Git");
        subjectsSeen.add("Selenium");

        ArrayList<String>futureSubjects=new ArrayList<>();
        futureSubjects.add("TestNG");
        futureSubjects.add("Cucumber");
        futureSubjects.add("SQL");
        futureSubjects.add("API");
        futureSubjects.add("Jenkins");
        futureSubjects.add("AWS");
        futureSubjects.add("Docker");
        futureSubjects.add("APIUM");

        ArrayList<String>allSubjects=new ArrayList<>();
        allSubjects.addAll(subjectsSeen);//adding all ellemnts from different arraylist Subjectseen
        allSubjects.addAll(1,futureSubjects);
        System.out.println("allSubjects = " + allSubjects);
//ctrl+c ---> select the whole line or shift +end (drop cursor at the beginning of the line first)
        ArrayList<String>allSubjects2=new ArrayList<>();
        allSubjects2.addAll(subjectsSeen);
        allSubjects2.addAll(1,futureSubjects);//the  elements of arraylist we add will start from index 1 and will push the existing data toward the end

    }
}