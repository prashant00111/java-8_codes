package com.java.intervew.stream;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeRemoveDuplicateName {
    public static void main(String[] args) {
        Map<Employee, Integer> map = EmployeeDB.getEmployeeMap();

        Map<Employee,Integer> unique = map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getFirstName))).distinct()
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2) -> e1, LinkedHashMap::new));
        unique.entrySet().forEach(System.out::println);


        System.out.println("-".repeat(100));

        unique.keySet().stream().sorted(Comparator.comparing(Employee::getFirstName))
                .distinct().toList().forEach(System.out::println);

        System.out.println("-".repeat(100));

        System.out.println(
         unique.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary).reversed()))
                .limit(3).skip(2).findFirst().get());

        System.out.println("-".repeat(100));

       map.keySet().stream().map(Employee::getFirstName).distinct().toList().forEach(System.out::println);

        System.out.println("-".repeat(100));

        Double sal = map.keySet().stream().map(Employee::getSalary).distinct()
                .sorted(Collections.reverseOrder()).limit(3).skip(2).findFirst().get();
        System.out.println(sal);
    }
}
