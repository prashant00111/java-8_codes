package com.java.intervew.stream.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class NumArrays {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(4,5,6,3);
        List<Integer> list2 = Arrays.asList(1,3,8,2);
        List<Integer> list3 = Arrays.asList(7,9,2);

        List<List<Integer>> numList = Arrays.asList(list1,list2,list3);
        System.out.println(numList);

        List<Integer> list = numList.stream().flatMap(Collection::stream).distinct().sorted().collect(Collectors.toList());
        System.out.println(list);
        List<Integer> even = numList.stream().flatMap(Collection::stream).distinct()
                .sorted().filter(n -> n%2==0).collect(Collectors.toList());
        System.out.println(even);
    }
}
