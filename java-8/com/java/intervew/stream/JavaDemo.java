package com.java.intervew.stream;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class JavaDemo {
    public static void main(String[] args) {
        String str = "aabbaaa";
        Map<String,Long> map = Arrays.stream(str.split("")).collect(Collectors.groupingBy(String::valueOf,Collectors.counting()));
        map.entrySet().forEach(s -> System.out.print(s.getKey()+""+s.getValue()));//a=3
        System.out.println();
        System.out.println("-".repeat(20));
        int len = str.length();
        int count =0;
        char [] ch = str.toCharArray();
        for(int i = 0; i < len; i++){
            for(int j = i + 1; j<len; j++){
                if(ch[i] == ch[j]){
                    ++count;
                }
                System.out.println(ch[i]+""+count);
            }
        }

    }
}
