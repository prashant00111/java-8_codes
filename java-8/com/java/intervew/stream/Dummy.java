package com.java.intervew.stream;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Dummy {
    public static void main(String[] args) {
        String s = "1,1,2,3,2,3,5,4,2,3,6,5,4,9,1,2,1";
        Map<String,Long> map = Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        map.entrySet().forEach(System.out::println);
        Integer [] i = {1,1,2,3,2,3,5,4,2,3,6,5,4,9,1,2,1};

    }
}