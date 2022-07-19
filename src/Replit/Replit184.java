package Replit;

import java.util.ArrayList;

public class Replit184 {
    /*
Create a array list that will hold Integer Objects:
Add below elements to it.
111
222
333
444
555
666
Print first, third and fifth element from your array
Expected Output:
111
333
555
     */
    public static void main(String[] args) {
        ArrayList<Integer> nums=new ArrayList<>();
        nums.add(111);
        nums.add(222);
        nums.add(333);
        nums.add(444);
        nums.add(555);
        nums.add(666);

        for(int i=0;i<nums.size();i++){
            if(nums.get(i)==111||nums.get(i)==333||nums.get(i)==555){
                System.out.println(nums.get(i));
            }
        }



    }
}
