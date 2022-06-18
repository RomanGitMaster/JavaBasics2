package com.syntax.class15class16.class16;


    public class InstanceDemo {
        String str="instance";
        void changeInstanceValue(){
            str="Captain Marvel";
        }

        void printIstanceValue(){
            System.out.println(str);
        }

        public static void main(String[] args) {
            InstanceDemo id=new InstanceDemo();
            System.out.println(id.str); // prints the value of str which is an instance
            id.printIstanceValue(); // method once simple prints the value of str which is still instance
            id.changeInstanceValue(); // this method changes the instance variable value which will be Captain Marvel
            //by using this method we can change value for instance variable str="instance", but it will take effect only
            //when we call the method, otherwise instance will stay the same
            id.printIstanceValue(); // method once simple prints the value of str which is now instance Captain Marvel
        }
    }

