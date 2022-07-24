package com.syntax.class30;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileReadDemo {
    public static void main(String[] args) throws IOException {
        //Get the path of the file
        String path="Files/Config.properties";
        //2 Navigating to that path where file is stored
        FileInputStream fileInputStream=new FileInputStream(path);// this is the class that we take our java program
        // at path, and then we will be able to read the data from there
        //3 -we need to have special software that understands that file that we can use to open and edit that file
        Properties properties=new Properties();// class that will help to read the files
        //loading all the data from the file inside the properties
        properties.load(fileInputStream);
        System.out.println(properties.getProperty("user"));
        fileInputStream.close();// close this file to save system resources

    }
}
