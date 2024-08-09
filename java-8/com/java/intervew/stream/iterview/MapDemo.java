package com.java.intervew.stream.iterview;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class MapDemo {
    public static void main(String[] args) {
        String str = "Bangalore";
        Map<String,Long> map = Arrays.stream(str.split("")).collect(Collectors.groupingBy(String::valueOf,Collectors.counting()));
        map.entrySet().stream().filter(m -> m.getValue()>1).forEach(m -> System.out.println(m.getKey() + " = " + m.getValue()));
    }
}
