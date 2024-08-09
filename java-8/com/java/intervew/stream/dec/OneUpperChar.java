package com.java.intervew.stream.dec;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OneUpperChar {
    public static void main(String[] args) {
        String [] str = {"java","aws","java","hibernate","python","javac","cobol"};
        String[] result = Arrays.stream(str)
                .filter(s -> s.length() == 5)
                .map(s -> Character.toUpperCase(s.charAt(0)) + s.substring(1))
                .toArray(String[]::new);
        Arrays.stream(result).forEach(System.out::println);
        System.out.println("-".repeat(30));

        List<String> list = Arrays.stream(str).filter(s -> s.length() ==5)
                .map(s -> Character.toUpperCase(s.charAt(0)) + s.substring(1)).toList();

        System.out.println(list);

    }
}
