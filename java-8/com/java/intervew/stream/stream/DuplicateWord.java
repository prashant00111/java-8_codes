package com.java.intervew.stream.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateWord {
    public static void main(String[] args) {
        List<String> word = Arrays.asList("java and hibernate and also java support jpa");
        Map<String, Long> map = word.stream().flatMap(w -> Arrays.stream(w.split(" ")))
                .collect(Collectors.groupingBy(String::valueOf,Collectors.counting()));
        map.entrySet().stream().filter(s -> s.getValue()>1).forEach((k) -> System.out.println(k.getKey() + " = " + k.getValue()));
    }
}
