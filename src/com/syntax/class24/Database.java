package com.syntax.class24;

public abstract class Database {//JDBC class developed by Java to use databases of different companies through  methods

 abstract  void open();
 abstract  void readData();
 abstract  boolean writeData();
 public void closeDataBase(){
     System.out.println("Terminate the connection to close it");
 }

}
class Informix extends Database{// we have to implement the abstract methods from abstract class in order to use them

    @Override
    void open() {
        System.out.println("Openening Informix database class");
    }

    @Override
    void readData() {
        System.out.println("reading the data from Informix database");
    }

    @Override
    boolean writeData() {
        System.out.println("Data written successfully");
        return true;
    }
}
class MySQLServer extends Database{

    @Override
    void open() {
        System.out.println("Openening MySQLServer database class");
    }

    @Override
    void readData() {
        System.out.println("reading the data from MySQLServer database");
    }

    @Override
    boolean writeData() {
        System.out.println("Data written successfully");
        return true;
    }
}

class DatabaseTester{
    public static void main(String[] args) {
        Database[] databases={new Informix(),new MySQLServer()};
        for( Database database:databases ){
            database.open();
            database.readData();
            database.writeData();
            database.closeDataBase();
        }
    }

}
