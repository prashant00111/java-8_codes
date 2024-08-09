package com.java.intervew.stream.stream;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateInMap {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(2,"Math");
        map.put(4,"Physics");
        map.put(1,"Chemistry");
        map.put(7,"History");
        map.put(8,"Math");
        map.put(9,"Physics");
        map.put(3,"Trigonometry");
        //Map<String,Long> list = map.entrySet().stream().collect(Collectors.groupingBy(String::valueOf,Collectors.counting()));
        //System.out.println(list);
        //map.entrySet().stream().map(m -> m.getValue()).distinct().toList().forEach(System.out::println);
        map.values().stream().distinct().toList().forEach(System.out::println);
        System.out.println("----------------------------------");
        map.entrySet().stream().distinct().toList().forEach(System.out::println);
        System.out.println("------------------");
        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);


    }
}
