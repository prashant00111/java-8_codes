package com.java.intervew.stream.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatStreamDemo {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("Gita","Ramayan","Puran");
        List<String> list2 = Arrays.asList("Maha Puran","Vishnu Puran","Garun Puran");
        List<String> list3 = Arrays.asList("Bramha","Vishnu","Mahesh");

        Stream<String> s1 = list1.stream();
        Stream<String> s2 = list2.stream();
        Stream<String> s3 = list3.stream();

        List<String> mergeList = Stream.concat(s1,Stream.concat(s2,s3)).filter(n -> n.startsWith("V")).toList();
        mergeList.forEach(System.out::println);
    }
}
