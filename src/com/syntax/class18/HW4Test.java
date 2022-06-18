package com.syntax.class18;

public class HW4Test {
    public static void main(String[] args) {
        HW4Pirate pirate1 = new HW4Pirate("Jack Sparrow", "Black Pearl", "cutlass", true);
        pirate1.display();

        HW4Pirate pirate2 = new HW4Pirate();
        pirate2.pirate = "Blackbeard";
        pirate2.ship = "Queen Anne's Revenge";
        pirate2.weapon = "broadsword";
        pirate2.real = true;
        pirate2.display();
    }
}