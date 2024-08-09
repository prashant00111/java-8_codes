package com.java.intervew.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringToIn {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(11,15,2,3,10,104);
        List<Integer> num =  integerList.stream().filter(n -> String.valueOf(n).startsWith("1")).collect(Collectors.toList());
        System.out.println(num);
    }
}
