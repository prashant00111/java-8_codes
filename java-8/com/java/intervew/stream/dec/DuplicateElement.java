package com.java.intervew.stream.dec;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElement {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(36,89,75,25,64,94,36,25);
        Set<Integer> set = new HashSet<>();
        list.stream().filter(n -> !set.add(n)).toList().forEach(System.out::println);
    }
}
