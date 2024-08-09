package com.java.intervew.stream.array;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] A = {5, 1, 4, 3};
        int result = sol(A);
        System.out.println(result);
    }
    public static int sol(int[] A) {
        int n = A.length;
        int maxSum = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (A[i] == A[j]) {
                    int currentSum = sumSubarray(A, i, j);
                    maxSum = Math.max(maxSum, currentSum);
                }
            }
        }
        return maxSum;
    }

    private static int sumSubarray(int[] A, int start, int end) {
        int sum = 0;
        for (int k = start; k <= end; k++) {
            if(start == end) {
                sum += A[k];
                System.out.println("Sum : " + sum);
            }
            else {
                sum = -1;
            }
        }
        return sum;
    }
}
