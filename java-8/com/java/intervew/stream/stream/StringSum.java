package com.java.intervew.stream.stream;

import java.util.Arrays;

public class StringSum {
    public static void main(String[] args) {
        String [] arr = {"Manoj","Prashant","ABC"};
        Arrays.stream(arr).flatMap(s -> Arrays.stream(s.split("\\s+")))
                .filter(word -> !word.isEmpty()).forEach(word -> {
                    int sum = word.chars().sum();
                    System.out.println("Sum of characters for '" + word + "': " + sum);
                });
    }
}
