package com.java.intervew.stream.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ArrayTest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4,5,6,8,9,7,2,4,8);
        //list.stream().sorted((i1,i2)-> i2>i1 ? i2:i1).toList().forEach(System.out::println);
        //System.out.println(sortNum);
        Optional<Integer> secMax = list.stream().max(Comparator.comparing(Integer::valueOf)).map(n -> n-1);
        System.out.println(secMax.get());
        System.out.println("---------");
       // Optional<Integer> secMin = list.stream().min(Comparator.comparing(Integer::valueOf)).map(n -> n+1);
        Optional<Integer> secMin = list.stream().sorted().limit(2).skip(1).findFirst();
        System.out.println(secMin.get());
        System.out.println("---------");
        Optional<Integer> secMaxNum = list.stream().reduce((n1, n2)-> n1 > n2 ? n1 : n2).map(n -> n-1);
        System.out.println(secMaxNum.get());
    }
}
