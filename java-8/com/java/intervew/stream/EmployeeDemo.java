package com.java.intervew.stream;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeDemo {
    public static void main(String[] args) {
        List<Employee> employeeList = EmployeeDB.getEmployees();
        employeeList.stream().filter(e -> e.getFirstName().startsWith("S")).toList().forEach(System.out::println);
        System.out.println("-----------------------------------------------");
        employeeList.stream().filter(e -> e.getSalary()>40000).map(e -> e.getSalary()+5000).toList().forEach(System.out::println);
        System.out.println("-----------------------------------------------");
        List<Employee> emp = employeeList.stream().sorted((e1,e2) -> (e1.getId() > e2.getId() ? e1 : e2).getId()).toList();
        System.out.println(emp);
        System.out.println("-----------------------------------------------");
        List<Employee> list = employeeList.stream().sorted(Comparator.comparing(Employee::getId).thenComparing(Employee::getSalary)).toList();
        System.out.println(list);
        System.out.println("------------------------------------------------");
       Map<String,Long> employees = employeeList.stream()
               .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
        System.out.println(employees);
        System.out.println("-".repeat(40));
        employeeList.stream().filter(n -> n.getFirstName().startsWith("R")).toList().forEach(System.out::println);



    }
}
