package com.java.intervew.stream.dec;

import java.util.stream.IntStream;

public class MissingNumber {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,9};
        int n = arr.length + 1;
        int result = n * (n + 1)/2;
        int actual = IntStream.of(arr).sum();
        int missingNum = result - actual;
        System.out.println(missingNum);
    }
}
