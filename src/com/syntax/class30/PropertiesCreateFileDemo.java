package com.syntax.class30;


import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesCreateFileDemo {
    public static void main(String[] args) throws IOException {
        // path where we want to create the file
        String path="Files/Trump.properties";
        // we need to go to that path to create that file
        //programmatically how it is done
        FileOutputStream fileOutputStream =new FileOutputStream(path);
        Properties properties=new Properties();//create the object of properties class to store properties inside the file
        properties.setProperty("Funny","true"); //store key value pair inside the object
        properties.store(fileOutputStream,"new property has been added");//store this data in the form of a file on our hard drive

        fileOutputStream.close();   // close that file
    }
}
