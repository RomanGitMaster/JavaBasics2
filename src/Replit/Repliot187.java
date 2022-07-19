package Replit;

import java.util.ArrayList;
import java.util.Iterator;

public class Repliot187 {
    /*
    Create an array list to type String.
Add these values below to your arraylist
hi
yo
sup
yolo
boop
Remove 1, 3, 5 element from an array
print remained values one by one in one line
Expected Output:
yo yolo
     */
    public static void main(String[] args) {
        ArrayList<String> greets = new ArrayList<>();
        greets.add("hi");
        greets.add("yo");
        greets.add("sup");
        greets.add("yolo");
        greets.add("boop");
       /* for (String greet:greets){
            if(!greet.contains("hi")&&!greet.contains("sup")&&!greet.contains("boop")){
                System.out.print(greet+" ");
            }

        */
            Iterator<String>iterator= greets.iterator();
            while(iterator.hasNext()){
                if(iterator.next().contains("hi")||iterator.next().contains("sup")||iterator.next().contains("boop")){
                    iterator.remove();

                }
            }
            /*
        Iterator<String>iterator2= greets.iterator();
        while(iterator2.hasNext()){
            if(iterator2.next().endsWith("i")){
                iterator2.remove();

            }
        }
        System.out.println(greets);

             */

        }
    }

