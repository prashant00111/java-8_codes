package com.java.intervew.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeDB {

    public static List<Employee> getEmployees(){

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(501,"Jai","Mishra","IT",35000));
        employees.add(new Employee(508,"Shree","Mishra","CSE",55000));
        employees.add(new Employee(504,"Ram","Mishra","ME",75000));
        employees.add(new Employee(506,"Prashant","Mishra","EC",80000));
        employees.add(new Employee(502,"Ruchi","Mishra","CSE",55000));
        employees.add(new Employee(507,"Vikas","Mishra","Sales",25000));
        employees.add(new Employee(503,"Rahul","Dubey","IT",65000));
        employees.add(new Employee(505,"Manoj","Mishra","ME",85000));
        employees.add(new Employee(503,"Manoj","Mishra","ME",87000));
        employees.add(new Employee(511,"Vikas","Mishra","ME",89000));
        employees.add(new Employee(511,"Vikas","Mishra","ME",89000));
        employees.add(new Employee(511,"Vikas","Mishra","ME",89000));

        return employees;
    }

    public static Map<Employee,Integer> getEmployeeMap(){
        Map<Employee,Integer> empMap = new HashMap<>();
        empMap.put(new Employee(205,"Shiva","Shambhu","Destroyer",100100),1);
        empMap.put(new Employee(209,"Raj","Tiwari","Support",45000),5);
        empMap.put(new Employee(212,"Prashant","Mishra","CSE",75000),36);
        empMap.put(new Employee(201,"Manoj","M.","Health",70000),9);
        empMap.put(new Employee(208,"Vikas","Mi..","Sales",25000),7);
        empMap.put(new Employee(207,"Manoj","M.","Health",70000),9);
        empMap.put(new Employee(203,"Vikas","Mi..","Sales",25000),7);


        return empMap;
    }
}
