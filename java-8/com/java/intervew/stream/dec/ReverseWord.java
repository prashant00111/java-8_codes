package com.java.intervew.stream.dec;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWord {
    public static void main(String[] args) {
        String s = "Hello";
        String rev = Arrays.stream(s.split(" ")).map(w -> new StringBuffer(w).reverse())
                .collect(Collectors.joining(" "));
        System.out.println(rev);
    }
}
