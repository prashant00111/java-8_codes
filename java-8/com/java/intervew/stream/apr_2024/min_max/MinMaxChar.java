package com.java.intervew.stream.apr_2024.min_max;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMaxChar {
    public static void main(String[] args) {
        List<Character> chars = Arrays.asList('a','b','c','d','g','t','p');
        char min = chars.stream().min(Comparator.comparing(Character::charValue)).get();
        System.out.println(min);
        System.out.println("-".repeat(30));
        char max = chars.stream().max(Comparator.comparing(Character::charValue)).get();
        System.out.println(max);
    }
}
