package com.java.intervew.stream;

import java.util.*;
import java.util.stream.Collectors;

public class MapTest {
    public static void main(String[] args) {
        Map<String, Integer> unsortedMap = new HashMap<>();
        unsortedMap.put("One", 20);
        unsortedMap.put("Three", 10);
        unsortedMap.put("Two", 30);
        Map<String ,Integer> map = unsortedMap.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2) -> e1, LinkedHashMap::new));
        map.forEach((k,v) -> System.out.println(k + " = " + v));
    }
}