package com.java.intervew.stream.iterview;

import java.util.HashMap;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee(1,"Jone");
        Employee e2 = new Employee(2,"Jane");

        HashMap<Employee,String> empMap = new HashMap<>();
        empMap.put(e1,"Employee 1");
        empMap.put(e2,"Employee 2");

        System.out.println(empMap.get(new Employee(1,"Jone")));
        System.out.println(empMap.get(new Employee(2,"Jane")));

    }
}
