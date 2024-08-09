package com.java.intervew.stream.array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo {
    public static void main(String[] args) {
        Object[] array = { 1, 2, new Object[]{ 3, 4, new Object[]{ 5 }, 6, 7 }, 8, 9, 10 };
        List<Object> list = Arrays.stream(array).flatMap(arr -> Arrays.stream(array)).toList();
        list.forEach(System.out::println);
    }
}
