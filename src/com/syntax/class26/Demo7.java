package com.syntax.class26;

import java.util.ArrayList;

public class Demo7 {


    public static void main(String[] args) {
        ArrayList<String>subjects=new ArrayList<>();
        subjects.add("SDLC");//0
        subjects.add("Manual Testing");//1
        subjects.add("Git");
        subjects.add("Selenium");
        subjects.add(1,"Jira");
        System.out.println(subjects.indexOf("Java"));//simply getting index position  of String "Git" in arraylist
        System.out.println(subjects.size());//tells us the total number of elements in arraylist
        subjects.remove("Java");
        System.out.println("subjects = " + subjects);//soutv- > shortcut "LIVE templates
        //for (int i = args.length - 1; i >= 0; i--) {// ritar elements of array in reverse order
        //    String arg = args[i];
        //           }
        System.out.println(subjects.contains("Selenium"));
        System.out.println("subjects.get(0) = " + subjects.get(0));
        System.out.println("subjects = " + subjects);
       subjects.clear();//clears all elements from arraylist
        System.out.println("subjects = " + subjects);

        }
    }


