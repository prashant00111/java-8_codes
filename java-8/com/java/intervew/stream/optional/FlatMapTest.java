package com.java.intervew.stream.optional;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;


public class FlatMapTest {
    public static void main(String[] args) {
        List<Integer> arr1 = Arrays.asList(2,5,7,10);
        List<Integer> arr2 = Arrays.asList(4,6,9,12,15);
        List<List<Integer>> merge = Arrays.asList(arr1,arr2);
        List<Integer> list = merge.stream().flatMap(Collection::stream).sorted().toList();
        list.forEach(System.out::println);
    }
}
