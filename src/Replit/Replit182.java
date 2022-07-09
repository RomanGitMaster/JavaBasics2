package Replit;

public class Replit182 {
    /*
    Create  a Person class with the following:

Class Variables

firstname
lastname
birthmonth
birthday
birthyear
String ssn
Constructor

The main constructor should take in all values and assign them to their respective private class variables

Methods

Create a public getters to access all the variables.

Create a public method called formatBirthday, which will return a String composed of their birthday in mm/dd/yyyy format. For example, if birthmonth=3, birthday=22, birthyear=2000, it should return the String "3/22/2000"

in Main Class.

Instantiate and object of Person and provide values. follows below outputs for values.

using getter and method print them separately.

Note: Read carefully the steps.

Expected Output:

John
Doe
10/25/1900

123-45-6789
     */
}
class PersonX{
    private String firstName;
    private String lastName;
    private int birthDay;
    private int birthMonth;
    private int birthYear;
    private String ssn;


    PersonX (String firstName,String lastName,int birthMonth,int birthDay,int birthYear, String ssn){
        this.firstName=firstName;
        this.lastName=lastName;
        this.birthMonth=birthMonth;
        this.birthDay=birthDay;
        this.birthYear=birthYear;
        this.ssn=ssn;
    }
    public String getFirstName (int adminId){
        if(adminId==12345){
            System.out.println(firstName);
        }else{
            System.out.println("Not valid admin ID");
        }
        return firstName;
    }

    public String getLastName(int adminId){
        if(adminId==12345){
            System.out.println(lastName);
        }else{
            System.out.println("Enter valid Admin ID");
        }
        return lastName;
    }
    public int getBirthDay(int adminId){
        if(adminId==12345){
            System.out.println(birthDay);
        }else{
            System.out.println("Enter valid Admin ID");
        }
        return birthDay;
    }
    public int getBirthMonth(int adminId){
        if(adminId==12345){
            System.out.println(birthMonth);
        }else{
            System.out.println("Enter valid Admin ID");
        }
        return birthMonth;
    }
    public int getBirthYear(int adminId){
        if(adminId==12345){
            System.out.println(birthYear);
        }else{
            System.out.println("Enter valid Admin ID");
        }
        return birthYear;
    }
    public String getSsn(int adminId){
        if(adminId==12345){
            System.out.println(ssn);
        }else{
            System.out.println("Enter valid Admin ID");
        }
        return ssn;
    }

    public String formatBirthday(String x){
        String format=(String.valueOf(birthMonth)+x+String.valueOf(birthDay)+x+String.valueOf(birthYear));
        return format;
    }


}
class MainX{

        public static void main(String[] args){
            PersonX person=new PersonX("John","Doe",10,25,1900,"123-45-6789");
            person.getFirstName(12345);
            person.getLastName(12345);
            System.out.println(person.formatBirthday("/"));
            person.getSsn(12345);
    }

}
