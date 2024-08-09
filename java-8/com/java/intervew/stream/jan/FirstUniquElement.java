package com.java.intervew.stream.jan;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstUniquElement {
    public static void main(String[] args) {
        String s = "aabbbccdfffeeg";
        Map<String, Long> map = Arrays.stream(s.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));

        String unik = map.entrySet().stream().filter(c -> c.getValue()==1).findFirst().get().getKey();
        System.out.println(unik);
    }
}
