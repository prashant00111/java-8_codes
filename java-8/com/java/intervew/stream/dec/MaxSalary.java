package com.java.intervew.stream.dec;



import com.java.intervew.stream.Employee;
import com.java.intervew.stream.EmployeeDB;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MaxSalary {
    public static void main(String[] args) {
        List<Employee> employeeList = EmployeeDB.getEmployees();
        Employee salary = employeeList.stream().max(Comparator.comparing(Employee::getSalary)).get();
        System.out.println(salary);

       Employee thirdMaxSal = employeeList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).distinct()
                .limit(3).skip(2).findFirst().get();
        System.out.println(thirdMaxSal);
    }
}
