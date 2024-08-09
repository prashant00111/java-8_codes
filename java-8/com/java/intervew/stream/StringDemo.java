package com.java.intervew.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringDemo {
    public static void main(String[] args) {
        String str = "Bangalore";

        Map<String,Long> map = Arrays.stream(str.split("")).collect(Collectors.groupingBy(String::valueOf,Collectors.counting()));
       // map.entrySet().stream().filter(c -> c.getValue()>1).forEach(c-> System.out.println(c.getKey()));
        map.entrySet().stream().forEach(System.out::println);
        List<Integer> list = Arrays.asList(7,5,8,2,3,6,7,5);
        System.out.println("-".repeat(15));
        list.stream().sorted().collect(Collectors.toSet()).forEach(System.out::println);
    }
}
