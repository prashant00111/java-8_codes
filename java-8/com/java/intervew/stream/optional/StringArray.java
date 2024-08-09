package com.java.intervew.stream.optional;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.stream.Collectors;

public class StringArray {
    public static void main(String[] args) {
        String [] str = {"java","python","ruby","pearl","java","ruby"};
       // HashSet<String> set = new HashSet<>();
        Map<String,Long> map = Arrays.stream(str).flatMap(s -> Arrays.stream(s.split(" ")))
                .collect(Collectors.groupingBy(String::valueOf,Collectors.counting()));
        map.entrySet().stream().forEach(w -> System.out.println(w.getKey()+ " = " + w.getValue()));

        System.out.println("-".repeat(35));
        Map<String,Integer> set = new HashMap<>();
        int count = 1;
        int len = str.length;
        for (int i = 0; i < len; i++){

            for (int j = 0; j < len; j++){
                if(str[i]==str[j]){
                    count++;
                }else {
                    set.put(str[i],count);
                    count = 1;
                }
            }
        }
        System.out.println(set + " ");
        System.out.println("-".repeat(30));
        for (Map.Entry<String, Integer> sub : set.entrySet()){
            System.out.println(sub.getKey() +" = " + sub.getValue());
        }
    }
}
