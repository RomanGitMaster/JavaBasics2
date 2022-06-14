package com.syntax.class15class16.class15;

public class MD2 {
    public static void main(String[] args) {
        int[]arr={10,20,30,40,50};
        ArrayUtils arrayUtils=new ArrayUtils();
        arrayUtils.printArray(arr);
        int sum=arrayUtils.sumArray(arr);//<---we have to specify in parentheses which array we want to use
        System.out.println(sum);



    }
}
