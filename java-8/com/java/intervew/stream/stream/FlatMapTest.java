package com.java.intervew.stream.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapTest {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("java","python","pearl");
        List<String> list2 = Arrays.asList("collection","hibernate","data science");
        List<String> list3 = Arrays.asList("hindi","english","spanish");

        List<List<String>> arrays = Arrays.asList(list1,list2,list3);
        System.out.println(arrays);
        System.out.println("------------------------------------");
        List<String> reduceList = arrays.stream().flatMap(list -> list.stream()).collect(Collectors.toList());
        System.out.println(reduceList);
    }
}
