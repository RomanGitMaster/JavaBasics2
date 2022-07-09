package com.syntax.class25;
public class ByThrees implements InterfaceIntro{
    int val;
    ByThrees(){
        val=0;
    }

    @Override
    public int getNext() {
      val+=3;
        return val;
    }
}