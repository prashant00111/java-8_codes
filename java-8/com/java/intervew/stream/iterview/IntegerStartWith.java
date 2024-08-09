package com.java.intervew.stream.iterview;

import java.util.Arrays;
import java.util.List;

public class IntegerStartWith {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(5,8,6,3,45,58,69,28,15,19,17);
        arr.stream().map(n -> n + "").filter(n -> n.startsWith("1")).toList().forEach(System.out::println);
    }
}
