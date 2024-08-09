package com.java.intervew.stream.array;

public class ArraysFoundElement {
    public static void main(String[] args) {
        int [][] arrays = {
                {1,5,6,8},{12,16,19,20},
                {2,3,9,7},{55,57,19,22},
                {31,25,56},{26,23,14,51},
                {7,35,42,49},{71,29,17,44},
                {57,21,7,63},{69,72,91,65}
        };

        int targetElement = 7; // The element you want to find

        boolean found = false;

        // Iterate through the arrays
        outerLoop:
        for (int[] array : arrays) {
            // Check if the target element is in the current array
            for (int element : array) {
                if (element == targetElement) {
                    found = true;
                    System.out.println("Element found: " + targetElement);
                    // Break out of the outer loop once the element is found
                    break outerLoop;
                }
            }
        }

        // If the element was not found in any array
        if (!found) {
            System.out.println("Element not found");
        }
    }
}
