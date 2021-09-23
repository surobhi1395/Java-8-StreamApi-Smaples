package com.sortlist.stream;

import com.streamapi.sample.Employee;
import com.streamapi.sample.EmployeeDao;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListDemo {

    public static void main(String[] args){

        List<Integer> list = Arrays.asList(10, 2, 18, 5, 12);
        // traditional way of sorting
        Collections.sort(list);
        System.out.println("Sorted List in Ascending Order: " + list);
        Collections.reverse(list);
        System.out.println("Sorted List in Descending Order: " + list);

        // sorting using stream in ascending order
         list.stream().sorted().forEach(s->System.out.println(s));
        // descending order using stream
         list.stream().sorted(Comparator.reverseOrder()).forEach(s->System.out.println(s));

        // retrieving the list of employees on the basis of salary
        List<Employee> employeeList = EmployeeDao.getAllEmp();
        // traditional way
        Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) (o2.getSalary()- o1.getSalary()); // descending order
            }
        });

        // with lambda
        Collections.sort(employeeList, (o1, o2) -> (int) (o2.getSalary()- o1.getSalary()));
        System.out.println(employeeList);

        // with stream
        employeeList.stream().sorted((o1, o2) -> (int) (o2.getSalary()- o1.getSalary()))
                .forEach(System.out::println);
    }


    /* static class MyComparator implements Comparator<Employee>{

        @Override
        public int compare(Employee o1, Employee o2) {
            return (int) (o1.getSalary()-o2.getSalary());
        }
    }
    */


}
