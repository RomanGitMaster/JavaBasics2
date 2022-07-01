package Replit;

public class Replit169 {
    /*
Create final method avgElements that will average all the elements in an integer array (passed to the method as a parameter) and return the average.
Expected Output:
4.8
     */
}

class Main9 {
    static final double avgElements(int[] a) {
        double av = 0;
        for (int i = 0; i < a.length; i++) {
            av += a[i];
        }
        return av / a.length;
    }

    public static void main(String[] args) {
        int[] a = {2, 7, 3, 8, 4};
        System.out.println(avgElements(a)); //should print 4.8
    }
}

