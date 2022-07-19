package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class HW1 {
    /*
    Create  a  class  Insurance  that  will  have  an
attribute as insuranceName and unimplemented
behaviour  as  getQuote  and  cancelInsurance.
Create 3 subclasses Car, Pet, Health. Car class has
it’s own attribute as carModel and Class Pet has
petType  attribute.  Create  3  objects  of  the  sub
classes  and  store  them  in  ArrayList.  Using  for
loop/advanced  for  loop/  iterator  access  all
methods of the class.
     */
    public static void main(String[] args) {
Insurance[]insurances={new Car("BMW"),new Pet("Husky"),new Health()};
        //Insurance ins1=new Car("BMW");
       // Insurance ins2=new Pet("Husky");
        //Insurance ins3=new Health();
        ArrayList<Insurance>wholeList=new ArrayList<>();
        for(Insurance insurance:insurances){
            wholeList.add(insurance);
        }
        //wholeList.add(ins1);
       // wholeList.add(ins2);
        //wholeList.add(ins3);

        for(Insurance list:wholeList){
          list.getQuote();
        }
        System.out.println("-------------------------------------------------------------");

        for(int i=0;i<wholeList.size();i++){
            wholeList.get(i).getQuote();
        }
        System.out.println("-------------------------------------------------------------");

        Iterator<Insurance>iterator=wholeList.iterator();
        while (iterator.hasNext()){
            iterator.next().getQuote();
        }




    }

    }

abstract class Insurance{
    String insuranceName;
    abstract void getQuote();
}
class Car extends Insurance{
 String carModel;
 Car(String carModel){
     this.carModel=carModel;
 }
    @Override
    void getQuote() {
        System.out.println("Quote for car "+carModel);
    }
}
class Pet extends Insurance{
 String petType;
 Pet(String petType){
     this.petType=petType;
 }
    @Override
    void getQuote() {
        System.out.println("Quote for pet "+petType);
    }
}
class Health extends Insurance{

    @Override
    void getQuote() {
        System.out.println("Quote for health coverage");
    }
}

