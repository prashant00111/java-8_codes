package com.java.intervew.stream.apr_2024.min_max;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMaxAge {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
          new Student(1,"Jagadis",24),
          new Student(2,"Mohan",32),
          new Student(3,"Rohan",21),
          new Student(4,"Reeta",25),
          new Student(5,"Radha",28)
        );

        System.out.println(studentList);
        System.out.println("-".repeat(100));
        Student minAge = studentList.stream().min(Comparator.comparing(Student::getAge)).get();
        System.out.println(minAge);
        System.out.println("-".repeat(100));
        Student maxAge = studentList.stream().max(Comparator.comparing(Student::getAge)).get();
        System.out.println(maxAge);
    }
}
