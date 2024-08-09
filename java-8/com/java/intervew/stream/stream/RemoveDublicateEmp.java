package com.java.intervew.stream.stream;

import com.java.intervew.stream.Employee;
import com.java.intervew.stream.EmployeeDB;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RemoveDublicateEmp {
    public static void main(String[] args) {
        List<Employee> empList = EmployeeDB.getEmployees();
        empList.stream().distinct().forEach(System.out::println);
        //System.out.println(remove);
    }
}
