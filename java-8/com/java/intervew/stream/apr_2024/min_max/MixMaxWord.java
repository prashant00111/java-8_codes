package com.java.intervew.stream.apr_2024.min_max;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MixMaxWord {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("C#","Java","Python","Pearl","Hibernate");
        String minlength = words.stream().min(Comparator.comparing(String::valueOf)).get();
        System.out.println(minlength);
        System.out.println("-".repeat(30));
        String maxLength = words.stream().max(Comparator.comparing(String::valueOf)).get();
        System.out.println(maxLength);
    }
}
