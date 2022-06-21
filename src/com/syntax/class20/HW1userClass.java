package com.syntax.class20;

public class HW1userClass {
    /*
    Write program: userClass  that has a constructor that initializes instance variable name and mobile number.
     Create a subclass  userInfo that will have user address variable and it also being initialized through constructor call.
      Print users name, mobile number and address in userDetails method. Test your code.
     */
    String name;
    String mobileN;
    HW1userClass(String name,String mobileN){
        this.mobileN=mobileN;
        this.name=name;
    }
}
class userInfo extends HW1userClass{
    String userAddress;
    userInfo(String name,String mobileN,String userAddress){
        super(name,mobileN);
        this.userAddress=userAddress;
    }
    void userDetails(){
        System.out.println(name+" "+mobileN+" "+userAddress);
    }

    public static void main(String[] args) {

        userInfo person=new userInfo("Alli Ababua","bird-messenger18","Cave of Wonders,Desert");
        person.userDetails();
    }
}
