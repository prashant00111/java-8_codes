package com.java.intervew.stream.stream;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicatChar {
    public static void main(String[] args) {
        String str = "Hibernaate";
        Map<String,Long> map = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(String::valueOf,Collectors.counting()));
        map.entrySet().stream().filter(c -> c.getValue()>1).forEach(c -> System.out.println(c.getKey()));
    }
}
