package Replit;

 class Replit181 {
     /*
     Create Class Account

Create the below variables:

acc_no;
name;
email;
double amount;
Create the getter/setter methods for each variable.

In Main Class and the main method.

Using setter methods assign the values as:

acc_no = 7560504000

name = Sumair

email = sumair@syntax.com

amount = 50000.0

Using getter methods print the values as below output.

Expected Output:

7560504000 Sumair sumair@syntax.com 50000.0
      */

}
 class Account{
    private long accNo;
    private String name;
    private String email;
    private double amount;

    public void setAccNo(long accNo){
        if(accNo>1 && accNo<=9999999999L){
            this.accNo=accNo;
        }else{
            System.out.println("Account number must have at least 1 and not more than 10 digits");
        }
    }

    public void setName(String name){
        String correctNameValue=name.replaceAll("[^A-Za-z]","");
        if (name.length()>1 && name.length()<=10 && name.equals(correctNameValue)){
            this.name=name;
        }else{
            System.out.println("The name should not have one or more than ten letters, no symbols and numbers");
        }
    }

    public void setEmail(String email){
        if(email.contains("@") && email.contains(".com")){
            this.email=email;
        }else{
            System.out.println("Valid email must have @ symbol and .com ending");
        }
    }

    public void setAmount(double amount){
        this.amount=amount;
    }

    long getAccNo(int adminId){
        if(adminId==12345){
            System.out.print(accNo+" ");
        }else{
            System.out.println("Enter valid Admin ID");
        }
        return accNo;
    }

    String getName(int adminId){
        if(adminId==12345){
            System.out.print(name+" ");
        }else{
            System.out.println("Enter valid Admin ID");
        }
        return name;
    }

    String getEmail(int adminId){
        if(adminId==12345){
            System.out.print(email+" ");
        }else{
            System.out.println("Enter valid Admin ID");
        }
        return email;
    }

    double getAmount(int adminId){
        if(adminId==12345){
            System.out.print(amount);
        }else{
            System.out.println("Enter valid Admin ID");
        }
        return amount;
    }
}
class Main000 {
    public static void main(String[] args){
        Account acc=new Account();
        acc.setAccNo(7560504000L);
        acc.setName("Sumair");
        acc.setEmail("sumair@syntax.com");
        acc.setAmount(50000.0);
        acc.getAccNo(12345);
        acc.getName(12345);
        acc.getEmail(12345);
        acc.getAmount(12345);
    }
}
