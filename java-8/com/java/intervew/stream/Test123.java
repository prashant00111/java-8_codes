package com.java.intervew.stream;

import java.util.*;
import java.util.stream.Collectors;

public class Test123 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");
        Map<String,Long> map = list.stream().collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        map.entrySet().forEach(System.out::println);
        System.out.println("-".repeat(40));
        List<Integer> num = Arrays.asList(2,4,6,7,12,23,7,1);
        Double avg = num.stream().collect(Collectors.averagingInt(Integer::valueOf));
        System.out.println("Avg : "+avg);

        System.out.println("-".repeat(40));
        List<String> sorting = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
        sorting.stream().map(String::length).sorted(Collections.reverseOrder()).toList().forEach(System.out::println);
        System.out.println("-".repeat(40));
        sorting.stream().sorted(Comparator.comparing(String::length).reversed()).toList().forEach(System.out::println);
        System.out.println("-".repeat(40));
        List<Integer> nums = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        Integer largest = nums.stream().sorted(Collections.reverseOrder()).limit(3).skip(2).findFirst().get();
        System.out.println(largest);
        System.out.println("-".repeat(40));
        nums.stream().map(n -> n + "").filter(n -> n.startsWith("1")).toList().forEach(System.out::println);

    }
}
