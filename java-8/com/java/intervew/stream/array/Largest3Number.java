package com.java.intervew.stream.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Largest3Number {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12,15,63,54,45,25,51);
        list.stream().sorted(Collections.reverseOrder()).filter(n -> n%2 !=0).limit(3).toList().forEach(System.out::println);
    }
}
