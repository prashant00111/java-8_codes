package com.java.intervew.stream.stream;

import java.util.Arrays;
import java.util.List;

public class Count {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ram","Krishna","Radha","Sita","Mahadev","Raghupati","Bholenath","Murlidhar");
        long list = names.stream().count();
        System.out.println(list);
        long count = names.stream().filter(n -> n.startsWith("R")).count();
        System.out.println(count);

    }
}
