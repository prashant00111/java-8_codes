package com.java.intervew.stream.iterview;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentsDemo {
    public static void main(String[] args) {
        List<Student> stds = Arrays.asList(
                new Student(101,"Raju",68,"CSE"),
                new Student(104,"Ram",89,"IT"),
                new Student(105,"Prabha",97,"ME"),
                new Student(109,"Sita",67,"CSE"),
                new Student(108,"Radha",91,"CSE")
        );

        List<Double> studentList = stds.stream().map(Student::getMarks).sorted(Collections.reverseOrder())
                .limit(3).skip(2).toList();
        System.out.println(studentList);

        System.out.println("--------------");

        Map<String,Long> map = stds.stream().collect(Collectors.groupingBy(Student::getDepartment,Collectors.counting()));
        map.forEach((department, count) -> System.out.println("Department : " + department + " , " + "Count of Student : " + count));
    }
}
