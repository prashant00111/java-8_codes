package com.java.intervew.stream.dec;

import com.java.intervew.stream.Employee;
import com.java.intervew.stream.EmployeeDB;

import java.util.List;

public class EmployeeNames {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeDB.getEmployees();
        List<Employee> names = employees.stream()
                .filter(n -> n.getFirstName().startsWith("R") || n.getFirstName().startsWith("P")).toList();
        for (Employee nm : names){
            System.out.println(nm);
        }
        System.out.println("-".repeat(100));

        List<String> name = employees.stream().distinct()
                .map(n -> n.getFirstName().startsWith("R") || n.getFirstName().startsWith("P") ? n + ": Nice" : n + " : Bad").toList();
        for(String naam : name){
            System.out.println(naam);
        }
    }
}
