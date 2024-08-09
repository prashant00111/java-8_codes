package com.java.intervew.stream.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SkipDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(4,5,6,2,1,3,8,7,9);
        List<Integer> num = numbers.stream().skip(2).toList();
        System.out.println(num);

        List<Integer> even = numbers.stream().filter(n -> n%2 ==0).toList();
        System.out.println(even);

        //2nd max number
        Optional<Integer> secMax = numbers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println(secMax.get());
    }
}
