package com.java.intervew.stream;

import java.util.*;
import java.util.stream.Collectors;

public class SortTest {
    public static void main(String[] args) {
     //   o/p - final String adds = "PUNE,HYDEFRABAD,THANE,MUMBAI,CHENNAI";
        // java 8 stream functional programming

        Map<String, List<String>> addsMap = new HashMap<>();

        addsMap.put("Dravid", List.of("Pune","GOA","Thane","Chennai"));
        addsMap.put("Sachin", List.of("Mumbai","Thane","Pune"));
        addsMap.put("PV Sindhu", List.of("Punjab","Delhi","Haryana"));
        addsMap.put("MS Dhoni", List.of("Goa","pune","Hyderabad"));
        String result = addsMap.entrySet()
                .stream()
                .filter(entry -> !entry.getKey().startsWith("P"))
                .flatMap(entry -> entry.getValue().stream().filter(c -> c.length() >3))
                .map(String::toUpperCase)
                .distinct()
                .sorted()
                .collect(Collectors.joining(","));

        System.out.println("Output: " + result);


    }
}
