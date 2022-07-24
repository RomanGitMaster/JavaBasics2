package com.syntax.class30;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

import java.util.Properties;

public class HW {
    /*
Create a property file to store following
configurations:
browser=chrome
url=https://facebook.com
username
password
Read file and extract values of
browser & url
     */
    public static void main(String[] args) throws IOException {
        String path = "Files/FacebookFile.properties";
        FileOutputStream fos = new FileOutputStream(path);
        Properties properties = new Properties();
        properties.setProperty("browser", "Chrome");
        properties.setProperty("url", "https://facebook.com");
        properties.setProperty("username", "bigboss13");
        properties.setProperty("password", "dupaholagrayevbasketbola");
        properties.store(fos, "hw");
        fos.close();
    }
}

        class ReadFacebookFile{
            public static void main(String[] args) throws IOException {

                String path = "Files/FacebookFile.properties";
                FileInputStream fis = new FileInputStream(path);
                Properties properties = new Properties();
                properties.load(fis);
                System.out.println("Browser is: " + properties.getProperty("browser"));
                System.out.println("URL is: " + properties.getProperty("url"));
                fis.close();
            }
}