package com.company;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class ListHW {

    public static void main(String[] args) {
        //create array list of numbers from 1 to 100
        List<Integer> numList = IntStream.rangeClosed(0,20).boxed().collect(Collectors.toList());
        List<Integer> randomNumList = new ArrayList<>(Arrays.asList(23,11,9,203,99,28,13,78,30,101,203,80));
        

        //find even numbers using stream in firstlist
        System.out.println("Find even numbers from List using stream");

        List<Integer> evenList = numList.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
        System.out.println(evenList);
        List<Integer> evenList2 = randomNumList.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
        System.out.println(evenList2);

        //find the numbers starting with "1" using stream function by converting it to string and read the first letter
        System.out.println("Find the numbers starting with '1' using stream function by converting it to string and read the first letter");
        List<Integer> withOneList1 = numList.stream().filter(num -> Integer.toString(num).startsWith("1")).collect(Collectors.toList());
        System.out.println(withOneList1);
        List<Integer> withOneList2 = randomNumList.stream().filter(num -> Integer.toString(num).startsWith("1")).collect(Collectors.toList());
        System.out.println(withOneList2);

        //find the total numbers of elements inside the list using stream function  
        System.out.println("Find the total numbers of elements inside the list using stream function");
        long totalList1 = numList.stream().count();
        System.out.println(totalList1);
        long totalList2 = randomNumList.stream().count();
        System.out.println(totalList2);

        //sort all values present in the list using stream functions
        System.out.println("Sort all values present in the list using stream functions");
        List<Integer> sortedList1 = numList.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList1);
        List<Integer> sortedList2 = randomNumList.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList2);

    }
}
