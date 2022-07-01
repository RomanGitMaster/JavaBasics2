package Replit;

public class Replit168 {
    /*
For you to do:

Create an instance final method that will reverse a String and return that new String

Call method from the main method

Expected Output:

olleh
     */
}
class Main89 {
    final static String reverseString(String s){
        StringBuilder str=new StringBuilder(s);
        return String.valueOf(str.reverse());
    }
    public static void main(String[] args){
System.out.println(reverseString("hello"));
    }
}