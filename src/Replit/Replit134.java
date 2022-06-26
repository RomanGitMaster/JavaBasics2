package Replit;

public class Replit134 {
    /*
 Write a method with the following specs:

Returns:

an integer
Name:

countVowels
Parameters:

a String called s
Purpose:

count the number of vowels in the string s.  Assume s is all lowercase.
Examples:

countVowels("obama") ==> 3
countVowels("happy friday! i love weekends") ==> 9
     */
   static int countVowels(String s){
       String vowels="";
       int count;
        for( int i=0;i<s.length();i++){

            if (s.charAt(i)=='a'||s.charAt(i)=='u'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='e'){
                vowels+=s.charAt(i);
            }
        } count=vowels.length();
        return count;
    }
    {

    }

    //test case below (dont change):
    public static void main(String[] args){
        System.out.println(countVowels("obama")); //3
        System.out.println(countVowels("happy friday! i love weekends")); //9
    }
}

