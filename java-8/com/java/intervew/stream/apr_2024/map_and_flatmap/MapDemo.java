package com.java.intervew.stream.apr_2024.map_and_flatmap;

import java.util.Arrays;
import java.util.List;

public class MapDemo {
    public static void main(String[] args) {
        List<Students> studentsList = Arrays.asList(
          new Students(1,"Ajay",63.8,"CSE"),
          new Students(2,"Vijay",89.2,"EEE"),
          new Students(3,"Radha",91.9,"ECE"),
          new Students(5,"Bina",56.8,"MEE"),
          new Students(4,"Himanshu",78.4,"CSE")
        );

        List<String> students = studentsList.stream().filter(s -> s.getPercentage() >60).map(n -> n.getName().toUpperCase()).toList();
        System.out.println(students);
        System.out.println("-".repeat(50));
        List<Double> per = studentsList.stream().map(Students::getPercentage).filter(p -> p >70).toList();
        per.forEach(System.out::println);
        System.out.println("-".repeat(50));
        List<String> dep = studentsList.stream().map(s -> s.getDep()).distinct().toList();
        dep.forEach(System.out::println);
    }
}
