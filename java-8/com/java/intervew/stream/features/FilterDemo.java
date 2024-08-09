package com.java.intervew.stream.features;

import com.java.intervew.stream.Employee;
import com.java.intervew.stream.EmployeeDB;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FilterDemo {


    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("math",101);
        map.put("physics",123);
        map.put("chemistry",458);
        map.put("geography",105);
        map.put("history",152);
        System.out.println(sortByKey(map));
        System.out.println("-".repeat(50));
        List<Employee> employees = EmployeeDB.getEmployees();
        System.out.println(findThirdMaxSalary(employees));
        System.out.println("-".repeat(50));
        System.out.println(nthMaxSalary(employees,3));
    }

    public static List<String> sortByKey(Map<String,Integer> map){
       return  map.keySet().stream().sorted(Comparator.comparing(String::valueOf).reversed()).toList();
    }

    public static Employee findThirdMaxSalary(List<Employee> employeeList){
        return EmployeeDB.getEmployees().stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).distinct()
                .limit(3).skip(2).findFirst().get();
    }

    public static Employee nthMaxSalary(List<Employee> employees,int nth){
        return EmployeeDB.getEmployees().stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
                .distinct().toList().get(nth -1);
    }
}
