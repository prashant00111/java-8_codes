package com.java.intervew.stream.dec;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringDemo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("AA", "BB", "AA", "CC");
        Map<String,Long> map = list.stream().collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        map.entrySet().forEach(System.out::println);
    }
}
