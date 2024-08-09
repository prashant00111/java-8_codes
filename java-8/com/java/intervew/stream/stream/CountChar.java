package com.java.intervew.stream.stream;

import java.util.Arrays;
import java.util.List;

public class CountChar {
    public static void main(String[] args) {
       // List<String> random = Arrays.asList("apspsssppcc","pintsskjah","localssasalk");
        String random = "prashantnnsnnsnnsnnsnks";
        char ch = 's';
        long count = random.chars().filter(c ->c ==ch).count();
        System.out.println(count);
    }
}
