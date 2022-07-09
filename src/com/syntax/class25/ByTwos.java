package com.syntax.class25;

public class ByTwos implements InterfaceIntro {
    int val;
    ByTwos(){
        val=0;

    }
    @Override
    public int getNext() {
        if (val>=MAX){
            System.out.println(ERRORMSG);
        }else {
            val+=2;
        }
        return val;
    }
    @Override
public void printStuff(){// here we're simply overriding default method from interface class
    System.out.println("I am byTwos class");
}//

}

class Main{
    public static void main(String[] args) {

        ByTwos byTwos=new ByTwos();
        ByThrees byThrees=new ByThrees();
        InterfaceIntro ob;

        System.out.println(InterfaceIntro.MAX); // all varibales of interface are public STATIC final, which means they can
                                               // be called using class(in our case interface name)
        for (int i=0;i<5; i++){
            ob=byTwos;
           // System.out.println("byTwos: "+ob.getNext());
            ob=byThrees;
           // System.out.println("byThrees: "+ob.getNext());
        }
        //byTwos.printStuff();


    }
}
