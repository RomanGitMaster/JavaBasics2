package com.syntax.class18;

public class HW9Book {
    //Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
    //Instance variables are being initialized.
    //Both Constructors are being executed.

    String book;
    int pages;
    HW9Book(String book,int pages ){
        this.book=book;
        this.pages=pages;
        System.out.println("Book "+book+" is "+pages+" pages long");
    }
    public static void main(String[] args) {
        HW9Book b1=new HW9Book("How To Make Money or Get Insane With Java",896798);
        HW9Book b2=new HW9Book("Coffee or Sleep- which is best for coding?",2);
    }
}
