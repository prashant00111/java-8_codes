package com.java.intervew.stream.stream;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,8,9,3,2,7,4,6,8,9,2,5);
        List<Integer> removeDuplicate = list.stream().distinct().sorted().toList();
        System.out.println(removeDuplicate);
        System.out.println();
        Integer sum = list.stream().collect(Collectors.summingInt(Number::intValue));
        System.out.println("Sum : "+sum);

        Double avg = list.stream().collect(Collectors.averagingInt(Number::intValue));
        System.out.println("Average : " + avg);

        Optional<Integer> max = list.stream().sorted(Collections.reverseOrder()).findFirst();
        System.out.println(max.get());
    }
}
