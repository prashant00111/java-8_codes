package com.java.intervew.stream.stream;

import com.java.intervew.stream.Employee;
import com.java.intervew.stream.EmployeeDB;

import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {
        List<Employee> list = EmployeeDB.getEmployees();
        list.stream().filter(e -> e.getSalary() >50000).map(s -> s.getSalary() + 3000).toList()
                .forEach(System.out::println);

    }
}
