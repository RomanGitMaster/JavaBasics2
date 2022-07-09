package com.syntax.class25;
// reviewing setter methods and use below
public class BankAccount {

    private String name;
    private String username;
    private String password;
    private double balance;
    private int age;

    public void setName(String name){//setter methods are always PUBLIC and always have return type VOID,
                                     // and the name starts with SETname
        //123Elexia
        String nameWithoutNumbers=name.replaceAll("[^A-Za-z]","");
        //Elexia
        if(nameWithoutNumbers.equals(name)){
            System.out.println("Numbers not present inside the name checking more rules");
            this.name=name;
        }else {
            System.out.println("only alphabets are allowed");
        }
    }
    public void setUsername(String userName){// setter methods usually public as setters and may take some parameters,
                                             // while setting rules and usually have return type
        if(userName.length()>8 && userName.length()<15){
            System.out.println("Username accepted");
            this.username=userName;
        }else {
            System.out.println("User names should be greater than 8 characters or less than 15");
        }
    }

    double getBalance(String username,String password){// getter method always starts with getName of getter method
        if(username.equals(this.username)&& password.equals(this.password)){
            return balance;
        }else {
            return -1;
        }
    }
}
 class AccountTester {
    public static void main(String[] args) {

        BankAccount KatsAccount=new BankAccount();
       /* KatsAccount.name="123456";
        KatsAccount.age=-200;
        KatsAccount.Balance=1111111110;*/
        KatsAccount.setName("Naveed");
        KatsAccount.setUsername("Naveed122344");
    }
}