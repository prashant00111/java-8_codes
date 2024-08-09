package com.java.intervew.stream.dec;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MaxOccurance {
    public static void main(String[] args) {
        String [] s = {"blr","mum","vns","mum","vns","mum"};
        Map<String,Long> map = Arrays.stream(s).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map.entrySet().stream().max(Map.Entry.comparingByValue()).get());
    }
}
