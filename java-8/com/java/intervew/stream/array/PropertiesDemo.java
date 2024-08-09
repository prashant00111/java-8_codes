package com.java.intervew.stream.array;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();

        FileInputStream fileInputStream = new FileInputStream("C:/Users/mishr/Desktop/java-8/abc.properties.txt");
        properties.load(fileInputStream);
        System.out.println(properties);

        String s = properties.getProperty("prashant");
        System.out.println(s);

        properties.setProperty("prashant", "88888");
        FileOutputStream fos = new FileOutputStream("C:/Users/mishr/Desktop/java-8/abc.properties.txt");
        properties.store(fos, "Updated by Prashant");
    }
}
