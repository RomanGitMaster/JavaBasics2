package Replit;
import java.util.Scanner;
public class Replit105 {
    public static void main(String[] args) {
        /*
For you to do:
There is a code that takes input as a String.
Write a program that will print out only vowels of that string
Sample input/outputs:
In: howdyho
oo
In: huehuehuehue
ueueueue
In: poopoo what idk what im doing
ooooaiaioi
 */
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below
        String vowels="";
        for(int i=0;i<word.length();i++){
            if (word.charAt(i)=='e'||word.charAt(i)=='u'||word.charAt(i)=='i'||word.charAt(i)=='o'||word.charAt(i)=='a'){
                vowels+=word.charAt(i);
            }
        }
        System.out.println(vowels);
    }
}

