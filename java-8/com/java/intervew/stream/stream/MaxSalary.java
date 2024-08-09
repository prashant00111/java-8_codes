package com.java.intervew.stream.stream;

import com.java.intervew.stream.Employee;
import com.java.intervew.stream.EmployeeDB;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MaxSalary {
    public static void main(String[] args) {
        List<Employee> list = EmployeeDB.getEmployees();
        Double secMaxSal = list.stream().sorted(Collections.reverseOrder(Comparator.comparing(Employee::getSalary))).limit(2).skip(1).findFirst().get().getSalary();
                // max(Comparator.comparing(Employee::getSalary)).get().getSalary();
        System.out.println(secMaxSal);
        System.out.println("-----------------");
        Double minSal = list.stream().min(Comparator.comparing(Employee::getSalary)).get().getSalary();
        System.out.println(minSal);
        System.out.println("------------");
        Double maxxSal = list.stream().reduce((e1,e2) -> e1.getSalary() > e2.getSalary() ? e1 : e2).get().getSalary();
        System.out.println(maxxSal);
        System.out.println("-----------");
        Double minSall = list.stream().reduce((e1,e2) -> e2.getSalary() > e1.getSalary() ? e1 : e2).get().getSalary();
        System.out.println(minSall);
    }
}
