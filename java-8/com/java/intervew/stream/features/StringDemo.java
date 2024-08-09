package com.java.intervew.stream.features;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringDemo {
    public static void main(String[] args) {
        String s = "prashantmishra";
        duplicateChars(s);
        System.out.println("-".repeat(50));
        System.out.println(duplicateChar(s));
        System.out.println("-".repeat(50));
        String str = "aabbbacccafggh";
        System.out.println(nonRepeat1stElement(str));
    }

    public static void duplicateChars(String word){
        Arrays.stream(word.split("")).collect(Collectors.groupingBy(s-> s,Collectors.counting()))
                .entrySet().stream().filter(w -> w.getValue() >1).forEach(System.out::println);
    }

    public static Set<String> duplicateChar(String word){
        Set<String> set = new HashSet<>();
        return Arrays.stream(word.split("")).filter(c -> !set.add(c)).collect(Collectors.toSet());
    }

    public static String nonRepeat1stElement(String word){
        return Arrays.stream(word.split("")).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().filter(c -> c.getValue() ==1).findFirst().get().getKey();
    }
}
