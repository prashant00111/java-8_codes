package com.java.intervew.stream.jan;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class SubStringDemo {
    public static void main(String[] args) {
        String s[] = {"aaaa", "a", "abaa","gfaa", "aaabbaaaaaa","fdaa", "ghfrf", "aaaaaaaa", "aaa", "ghtra"};

        List<String> list = Arrays.stream(s).filter(w -> w.length() >=3 && w.contains("aaa")).toList();
        System.out.println(list);

    }
}
