package com.streamapi.sample;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {

    public static List<Employee> getAllEmp(){
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(101, "A", "IT", 30000));
        empList.add(new Employee(102, "B", "Developer", 70000));
        empList.add(new Employee(101, "C", "HR", 50000));
        empList.add(new Employee(101, "D", "QA", 80000));
        empList.add(new Employee(101, "E", "Senior Developer", 90000));
        return empList;
    }

// adding some comment
}
