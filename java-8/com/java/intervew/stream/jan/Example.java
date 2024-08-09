package com.java.intervew.stream.jan;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("Confirm","Air India");
        map.put("Checkout","IndiGo");
        map.put("Pending","Go Air");

        String plain = map.entrySet().stream().filter(m -> m.getKey().equals("Confirm")).map(Map.Entry::getValue).toList().toString();
        System.out.println(plain);
        String status = map.entrySet().stream().filter(s -> s.getValue().equals("IndiGo")).map(Map.Entry::getKey).toList().toString();
        System.out.println(status);


    }
}
