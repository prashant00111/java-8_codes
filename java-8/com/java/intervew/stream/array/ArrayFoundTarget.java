package com.java.intervew.stream.array;

import java.util.Arrays;

public class ArrayFoundTarget {
    public static void main(String[] args) {
        int[][] arrays = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {44,55,12,9,53,56}
        };

        int targetElement = 9; // The element you want to find

        boolean found = Arrays.stream(arrays)
                .anyMatch(array -> Arrays.stream(array).anyMatch(element -> element == targetElement));

        if (found) {
            System.out.println("Element found: " + targetElement);
        } else {
            System.out.println("Element not found");
        }
    }
}
