package com.java.intervew.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4,2,3,5,5,6);
        List<Integer> n = (List<Integer>) list.stream().collect(Collectors.toSet());
    }
}
