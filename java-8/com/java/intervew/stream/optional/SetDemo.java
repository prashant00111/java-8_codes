package com.java.intervew.stream.optional;

import java.util.*;
import java.util.stream.Stream;

public class SetDemo {
    public static void main(String[] args) {
        HashSet<Integer> arr = new HashSet<>();
        arr.add(8);
        arr.add(6);
        arr.add(4);
        arr.add(9);
        arr.add(3);
        arr.add(2);
        List<Integer> list = arr.stream().sorted(Collections.reverseOrder()).filter(n -> n%2 !=0).toList();
        list.forEach(System.out::println);
        System.out.println("-".repeat(30));
        System.out.println(arr);

        List<Integer> list1 = Arrays.asList(2,5,3,7,4,9,1,6);

        Stream<Integer> secMax = list1.stream().max(Integer::compare).stream().skip(1);
        System.out.println(secMax);
    }
}
