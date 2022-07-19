package com.syntax.class29;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

//How to read properties file
public class ConfigFileDemo {
    public static void main(String[] args) throws IOException {
        //Steps to read a file:
        //1 -we need to know the path or location of that file
        String path="Files/Config.properties";// how we can path ? right click on Config.properties file and select copy
        // path/reference, and selet in what way you want to copy the path>After we just paste it wherever we need that path

        //2 Navigating to that path where file is stored

        FileInputStream fileInputStream=new FileInputStream(path); // this is the class that we take our java program
        // at path, and then we will be able to read the data from there

        //3 -we need to have special software that understands that file that we can use to open and edit that file
        Properties properties=new Properties(); // clss that will helpt to read the files
        //loading all the data from the file inside the properties
        properties.load(fileInputStream);
        // and here we will see the data from the file
        System.out.println(properties.get("user"));
        System.out.println(properties.get("password"));
        System.out.println(properties.get("URL"));

        fileInputStream.close();// its a good practice to close files (similar to how we did scanner)

    }
}
