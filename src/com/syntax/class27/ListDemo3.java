package com.syntax.class27;

import java.util.ArrayList;
import java.util.List;

public class ListDemo3 {

        public static void main(String[] args) {
            ArrayList<String> legends= new ArrayList<>(); //recommended
            legends.add("Hamid"); //0
            legends.add("Karla"); //1
            legends.add("Naveed"); //2
            legends.add("Tara"); //3
            legends.add("Yusuf");//4
            legends.add("Yusuf");//5
            legends.add("Herbert");//6
            legends.add("Yusuf");//7
            System.out.println(legends.get(4));
            System.out.println(legends.get(2));
            System.out.println(legends);


            legends.set(0,"Hamid Jan"); // replaces an index
            System.out.println(legends);
            System.out.println(legends.indexOf("Yusuf"));//method will provide only first index of element , even if there are duplicates
            System.out.println(legends.lastIndexOf("Yusuf"));//method will provide only last index of element, even if there are duplicates

            System.out.println(legends.subList(0,3)); //3-0=3
            //subList() method that will provide elements from starting index (inclusively) to ending index(exclusively)


            List<String> elements=new ArrayList<>();
            System.out.println(elements.isEmpty());
            elements.add("Syntax");
            System.out.println(elements.isEmpty());
        }
    }

