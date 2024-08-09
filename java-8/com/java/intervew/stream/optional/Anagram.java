package com.java.intervew.stream.optional;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "race";
        String str2 = "care";

        int len1 = str1.length();
        int len2 = str2.length();

        if(len1 == len2) {
            boolean isAnagram = Arrays.equals(str1.chars().sorted().toArray(),
                    str2.chars().sorted().toArray());
            if(isAnagram){
                System.out.println("Given string is anagram : " + str1);
            }else
                System.out.println("given string is not anagram : " + str1);
        }else {
            System.out.println("Given string does not match the length : " + str1);
        }
    }
}
