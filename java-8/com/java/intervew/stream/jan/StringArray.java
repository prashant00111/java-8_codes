package com.java.intervew.stream.jan;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringArray {
    public static void main(String[] args) {
        String s = "mynameisprashant";
        String [] str = s.split("");
        System.out.println(Arrays.toString(str));
        System.out.println("-".repeat(100));
        Map<String, List<String>> mapGroup = Arrays.stream(s.split("")).collect(Collectors.groupingBy(w ->w));
        System.out.println(mapGroup);
        System.out.println("-".repeat(100));
        Map<String, Long> map = Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);
    }
}
