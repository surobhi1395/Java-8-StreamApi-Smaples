package com.streamapi.sample;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeService {

    public static List<Employee> checkTaxUsers(String input){
        // getting list of all employees first
        // using filter to get employees having salary > 50,000
        /* if(input.equalsIgnoreCase("tax")) {
            return EmployeeDao.getAllEmp().stream()
                    .filter(emp -> emp.getSalary() > 50000).collect(Collectors.toList());
        }
       else
           return EmployeeDao.getAllEmp().stream()
                   .filter(emp-> emp.getSalary()<50000).collect(Collectors.toList());
                   */

        // with ternary operator
        return (input.equalsIgnoreCase("tax"))
                ? EmployeeDao.getAllEmp().stream().filter(employee->employee.getSalary()>50000)
                .collect(Collectors.toList())
                : EmployeeDao.getAllEmp().stream().filter(employee->employee.getSalary()<50000)
                .collect(Collectors.toList());

    }

    public static void main(String[] args){
        System.out.println(checkTaxUsers("tax"));
    }
}
