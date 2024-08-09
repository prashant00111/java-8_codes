package com.java.intervew.stream.stream;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class ForEachOrderTest {
    public static void main(String[] args) {
        LocalDateTime start = null;
        LocalDateTime end = null;
        Duration duration =null;

        List<String> names = Arrays.asList("java","python","spring","aws","hibernate","jpa","c++","c#");

        System.out.println(names);
        start = LocalDateTime.now();
        names.stream().map(String::toUpperCase).forEachOrdered(System.out::println);

        end = LocalDateTime.now();
        duration = Duration.between(start,end);
        System.out.println("\nTime difference in Milliseconds"
                + " after SEQUENTIAL processing = " + duration.toMillis() + " ms");


        start = LocalDateTime.now();
        names.parallelStream().map(String::toUpperCase).forEachOrdered(System.out::println);

        end = LocalDateTime.now();
        duration = Duration.between(start,end);
        System.out.println("\nTime difference in Milliseconds"
                + " after PARALLEL processing = " + duration.toMillis() + " ms");

    }
}
