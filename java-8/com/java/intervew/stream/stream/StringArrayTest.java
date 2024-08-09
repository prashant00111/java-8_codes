package com.java.intervew.stream.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StringArrayTest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("java","python","spring","hibernate","aws");
        String maxLenStr = list.stream().max(Comparator.comparing(String::valueOf)).get();
        System.out.println(maxLenStr);
        System.out.println("---------------");
        String max = list.stream().reduce((s1,s2) -> s1.length() > s2.length() ? s1:s2).get();
        System.out.println(max);
        System.out.println("-------------");
        String minLenStr = list.stream().min(Comparator.comparing(String::valueOf)).get();
        System.out.println(minLenStr);
        System.out.println("---------------");
        String min = list.stream().reduce((s1,s2) -> s2.length() > s1.length() ? s1 : s2).get();
        System.out.println(min);

    }
}
