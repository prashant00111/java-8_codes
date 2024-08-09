package com.java.intervew.stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.stream.Collectors;

public class StringTest {
    public static void main(String[] args) {
        String s = "abcbbacabcadaa";
//        Map<String,Long> map =Arrays.stream(s.split("")).collect(Collectors.groupingBy(String::valueOf,Collectors.counting()));
//        map.entrySet().forEach(c -> System.out.println(c.getKey() +" = " + c.getValue()));
        char [] ch = s.toCharArray();
        int len = ch.length;
        HashSet<Character> set  = new HashSet<>();
        for (int i = 0; i< len; i++){
            set.add(ch[i]);
        }

        System.out.println(set);
        System.out.println("-".repeat(25));
        for(char c : set){
            System.out.print(c + " ");
        }
    }
}
