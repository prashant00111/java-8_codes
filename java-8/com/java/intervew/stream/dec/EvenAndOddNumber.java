package com.java.intervew.stream.dec;

import java.util.Arrays;
import java.util.List;

public class EvenAndOddNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(22,59,63,74,98,28,34,76);
        list.stream().filter(n -> n%2 ==0).toList().forEach(System.out::println);

        System.out.println("-".repeat(30));

        list.stream().map(n -> n % 2 == 0 ? n + " Even" : n + " Odd").sorted().toList().forEach(System.out::println);

        System.out.println("-".repeat(30));

        list.stream().map(n -> n +"").filter(n -> n.startsWith("7")).forEach(System.out::println);

    }
}
