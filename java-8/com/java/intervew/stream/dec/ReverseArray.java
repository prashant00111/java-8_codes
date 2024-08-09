package com.java.intervew.stream.dec;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = new int[] {5, 1, 7, 3, 9, 6};
        List<Integer> list = IntStream.rangeClosed(1,array.length).boxed().map(n -> array[array.length-n]).toList();
        System.out.println(list);
    }
}
