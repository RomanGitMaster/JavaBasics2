package com.syntax.class25;
interface DDR3{
    void read();
    void write();

}
public interface DDR4 extends DDR3 { // extending interface to interface to receive all methods from previous interface

    void speed();
}
class Samsung implements DDR4{

    @Override
    public void read() {
        System.out.println("Reading speed is now 3Gbp/s");
    }

    @Override
    public void write() {
        System.out.println("writing speed is now 3GBp/s ");
    }

    @Override
    public void speed() {
        System.out.println("Extra speed of 1GBp/s");
    }
}