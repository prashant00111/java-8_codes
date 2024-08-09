package com.java.intervew.stream;

import java.util.List;
import java.util.stream.IntStream;

public class RevArray {
    public static void main(String[] args) {
        int [] arr = {1,3,5,6,9,4};
        List<Integer>list = IntStream.rangeClosed(1,arr.length).map(n ->arr[arr.length-n]).boxed().toList();
        System.out.println(list);
    }
}
