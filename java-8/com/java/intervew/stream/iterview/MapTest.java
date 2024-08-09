package com.java.intervew.stream.iterview;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapTest {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("ajay",100);
        map.put("bijay",200);
        map.put("joy",500);
        map.put("prashant",300);

        Map<String,Integer> sort = map.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2) -> e1, LinkedHashMap::new));

        System.out.println(sort);
        System.out.println("-".repeat(45));
        map.values().stream().sorted(Collections.reverseOrder()).toList().forEach(System.out::println);
        System.out.println("-".repeat(45));
        map.keySet().stream().sorted(Collections.reverseOrder()).toList().forEach(System.out::println);
    }
}
