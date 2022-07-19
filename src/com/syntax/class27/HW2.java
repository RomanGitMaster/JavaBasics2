package com.syntax.class27;

import java.util.Iterator;
import java.util.LinkedList;

public class HW2 {
    /*
    Create a Card class that will have implemented and unimplemented methods and a constructor
that  will  initialize  credit  card  type.    Create  3 subclasses  of  a  Card  class.  Create  3  objects  of
different  card  and  store  them  into  LinkedList. Using  for  loop/advanced  for  loop/  iterator
access all methods of the class.
     */
    public static void main(String[] args) {
        Card[]creditcards={new Visa("Visa"),new MasterCard("MasterCard"),new Discover("Discover")};
       // Card card1 = new Visa("Visa");
        //Card card2 = new MasterCard("MasterCard");
       // Card card3 = new Discover("Discover");
        LinkedList<Card> cards = new LinkedList<>();
        //cards.add(card1);
        //cards.add(card2);
        //cards.add(card3);
        for(Card creditcard:creditcards){
            cards.add(creditcard);

        }

        System.out.println("----------------------------------------------------------------------------");
        for (Card card : cards) {
            card.creditCardInterest();
            card.showBalance();
        }

        System.out.println("----------------------------------------------------------------------------");
        for (int i = 0; i < cards.size(); i++) {
            cards.get(i).showBalance();
            cards.get(i).creditCardInterest();
        }

        System.out.println("----------------------------------------------------------------------------");
        Iterator<Card> iterator = cards.iterator();
        while (iterator.hasNext()) {
            iterator.next().creditCardInterest();

        }
        Iterator<Card> iterator2 = cards.iterator();
        while (iterator2.hasNext()) {
            iterator2.next().showBalance();

        }


    }
}

abstract class Card {
    String creditCardType;

    Card(String creditCardType) {
        this.creditCardType = creditCardType;
    }

    abstract void showBalance();

    void creditCardInterest() {
        System.out.println("Interest for " + creditCardType);
    }
}

class Visa extends Card {

    Visa(String creditCardType) {
        super(creditCardType);
    }

    @Override
    void showBalance() {
        System.out.println("Shows balance for Visa credit card");
    }
}

class MasterCard extends Card {

    MasterCard(String creditCardType) {
        super(creditCardType);
    }

    @Override
    void showBalance() {
        System.out.println("Shows balance for MasterCard credit card");
    }
}

class Discover extends Card {

    Discover(String creditCardType) {
        super(creditCardType);
    }

    @Override
    void showBalance() {
        System.out.println("Shows balance for Discover credit card");
    }
}