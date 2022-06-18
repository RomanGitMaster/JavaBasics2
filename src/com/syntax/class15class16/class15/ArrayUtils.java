package com.syntax.class15class16.class15;

public class ArrayUtils {


    void printArray(int[]arr){
        for (int num:arr){
            System.out.println(num);
        }

    }
int sumArray(int[]arr){
        int sum=0;
        for(int num:arr){
            sum=sum+num;
        }
        return sum;
}
    public static void main(String[] args) {
ArrayUtils md=new ArrayUtils();


    }
}
