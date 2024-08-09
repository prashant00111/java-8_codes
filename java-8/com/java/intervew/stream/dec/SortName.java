package com.java.intervew.stream.dec;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortName {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Abhi","Hyderbad"),
                new Employee("Raju","Varanasi"),
                new Employee("Prashant","Jaunpur"),
                new Employee("Manoj","Jaunpur"),
                new Employee("Ruchi","Jaunpur"),
                new Employee("Rahul","Bangalore")

        );
    employees.stream().sorted(Comparator.comparing(Employee::getCity).thenComparing(Employee::getName).reversed())
            .toList().forEach(System.out::println);

    }
}
