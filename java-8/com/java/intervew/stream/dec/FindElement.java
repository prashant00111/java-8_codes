package com.java.intervew.stream.dec;

import java.util.Arrays;
import java.util.List;

public class FindElement {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,6,9,8,3,7,5,1);
        list.stream().sorted().findAny().ifPresent(System.out::println);
        list.stream().findAny().get();
    }
}
