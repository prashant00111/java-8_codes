package com.java.intervew.stream.apr_2024.min_max;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinDemo {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,8,9);
        Integer min = num.stream().min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(min);
        System.out.println("-".repeat(30));
        Integer max = num.stream().max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(max);
    }
}
