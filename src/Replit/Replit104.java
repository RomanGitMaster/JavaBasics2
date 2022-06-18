package Replit;
import java.util.Scanner;
public class Replit104 {
    public static void main(String[] args) {
        /*
For you to do:
Create an array of names that will hold 5 String elements.
Names must be taking from a user.
Print out the first three characters of each element of the array, one per line.
Note: every array element must be at least 3 characters long.
Inpu Example:
John
Jane
Jimmy
Mike
Emily
Expected Output:
Joh
Jan
Jim
Mik
Emi
 */

        String[] names=new String[5];
        Scanner scan=new Scanner(System.in);
        for (int i=0;i<names.length;i++){
            String name=scan.next();
            names[i]+=name;
            System.out.println(name.substring(0,3));
        }
        scan.close();
    }
}
