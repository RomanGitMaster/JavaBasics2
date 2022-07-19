package Replit;

import java.util.LinkedList;

public class Replit190 {
    /*
    Create Linked List that will store first 10 numbers of fibonacci series

Print number from Linked List 1 by 1 all in 1 line

Expected Output:

0 1 1 2 3 5 8 13 21 34
     */
    public static void main(String[] args) {
        LinkedList<Integer>fibos=new LinkedList<>();
        Integer a=0;
        Integer b=1;
        Integer k=0;
      /* while(k<=34){

           fibos.add(k);
           k=a+b;
           a=b;
           b=k;
       }
        System.out.println(fibos);

       */


       for(int i=0;i<10;i++){
           fibos.add(i,a);
           System.out.print(fibos.get(i)+" ");
           k=a+b;
           a=b;
           b=k;
       }



    }
}
