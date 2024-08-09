package com.java.intervew.stream.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArrDemo {
    public static void main(String[] args) {
        List<Integer> list  = Arrays.asList(2,5,7,8,9);
        list.stream().sorted(Collections.reverseOrder());
    }
}
