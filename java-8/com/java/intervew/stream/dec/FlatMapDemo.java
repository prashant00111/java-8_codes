package com.java.intervew.stream.dec;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3,4},{5,6,7,8}};
        int[] array = Arrays.stream(arr).flatMapToInt(Arrays::stream).toArray();

        List<Integer> list = Arrays.stream(arr).flatMapToInt(Arrays::stream).boxed().toList();

        list.forEach(System.out::println);
        System.out.println("-".repeat(20));

        for (int n : array){
            System.out.print(n+", ");
        }
    }
}
