package com.java.intervew.stream.dec;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class StringGrops {
    public static void main(String[] args) {
        String s = "aabbbaaaa";
        System.out.println(s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet()
                .stream()
                .map(entry -> entry.getKey() + entry.getValue().toString())
                .collect(Collectors.joining()));
    }
}
