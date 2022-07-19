package Replit;

import java.util.ArrayList;
import java.util.Scanner;

public class Replit188 {
    /*
    Using Scanner class add 5 elements into ArrayList and then print all elements from that ArrayList all in 1 line
Numbers in:
4
62
8
5
4
Expected Output:
4 62 8 5 4
     */
    public static void main(String[] args) {
        ArrayList<Integer> nums=new ArrayList<>();
        Scanner scan=new Scanner(System.in);
        for(int i=0;i<5;i++){
            nums.add(scan.nextInt());
        }
        scan.close();
        for(Integer num:nums){
            System.out.print(num+" ");
        }

    }
}
