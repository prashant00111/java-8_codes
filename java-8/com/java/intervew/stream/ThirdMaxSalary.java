package com.java.intervew.stream;

import java.util.Collections;
import java.util.List;


public class ThirdMaxSalary {
    public static void main(String[] args) {
        List<Employee> empList = EmployeeDB.getEmployees();
        Double salary = empList.stream().map(Employee::getSalary).distinct()
                .sorted(Collections.reverseOrder()).limit(3).skip(2).findFirst().get();
        System.out.println(salary);
    }
}
