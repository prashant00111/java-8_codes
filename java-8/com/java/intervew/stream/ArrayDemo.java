package com.java.intervew.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ArrayDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,9,6,4,6,2,7,1,8,3,5);
        list.stream().sorted().toList().forEach(System.out::println);
        System.out.println("------------------");
        list.stream().filter(n -> n>5).map(n -> n * n).sorted().toList().forEach(System.out::println);
        System.out.println("------------");
        Map<Integer,Long> map = list.stream().collect(Collectors.groupingBy(Number::intValue,Collectors.counting()));
        map.entrySet().stream().filter(n -> n.getValue()>1).forEach(n -> System.out.println(n.getKey()));
        System.out.println("------------------------");
        Integer max = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(max);



    }
}
