package com.sortlist.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortListDemo {

    public static void main(String[] args){

        List<Integer> list = Arrays.asList(10, 2, 18, 5, 12);
        // traditional way of sorting
        Collections.sort(list);
        System.out.println("Sorted List in Ascending Order: " + list);
        Collections.reverse(list);
        System.out.println("Sorted List in Descending Order: " + list);



    }

}
