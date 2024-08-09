package com.java.intervew.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ArraysDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,4,4,2,5);
        Map<Integer,Long> map =  list.stream().collect(Collectors.groupingBy(Integer::valueOf,Collectors.counting()));
        map.entrySet().stream().filter(n -> n.getValue() >1).forEach(n -> System.out.println(n.getKey() + " = " + n.getValue()));
    }
}
