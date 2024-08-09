package com.java.intervew.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class MapToIntDemo {
    public static void main(String[] args) {
        List<String> techStack = Arrays.asList(
                "java",
                "spring",
                "hibernate",
                "webservices",
                "databases"
        );

        IntStream len = techStack.stream().mapToInt(s -> s.length());
        len.forEach(System.out::println);
    }
}
