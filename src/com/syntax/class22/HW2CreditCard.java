package com.syntax.class22;

public class HW2CreditCard {
    /*
Create a class CreditCard and define variable balance and interest. Create an instance method that will calculate
interest based on the given balance.
Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
Call the method by creating an object of each of the three classes.
     */

    double balance;
    double interestRate;

    HW2CreditCard(double balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
        interestCalculator();
    }
    void interestCalculator() {
        System.out.println("Interest that has to be paid on balance of " + balance + " and with interest rate " + interestRate + " is " + (balance * (interestRate / 100)));
    }
}
class Visa extends HW2CreditCard {

    Visa(double balance, double interestRate) {
        super(balance, interestRate);
    }
}
class AX extends HW2CreditCard {
    AX(double balance, double interestRate) {
        super(balance, interestRate);

    }
@Override
    void interestCalculator() {
        System.out.println("Interest that has to be paid on balance of " + balance + " and with interest rate " + interestRate + " is " + (balance * (interestRate / 100)+12.50) + " (12.50 some  additional fees from AX");
    }
    }

class CardsTest {
    public static void main(String[] args) {


        HW2CreditCard card = new HW2CreditCard(1000, 6);
        Visa card1 = new Visa(2000, 6);
        AX card2 = new AX(1000,6);

    }
}
