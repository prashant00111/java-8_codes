package com.java.intervew.stream.iterview;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicats {
    public static void main(String[] args) {
        int [] arr = {2,8,6,3,1,9,7,4,5,3,8};

        Set<Integer> unique = new HashSet<>();
        for (int i : arr){
            unique.add(i);
        }
        System.out.println(unique);
    }
}
