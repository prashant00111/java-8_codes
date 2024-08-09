package com.java.intervew.stream.jan;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int [] arr = {2,4,-5,6,1,9,5,-7,-2};
        int [] array = {7,0,6,8,0,3,6,0,1,0};
       moveAllNegativeNum(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("-".repeat(30));
        moveAllNegativeNum(array);
        System.out.println(Arrays.toString(array));
        System.out.println("-".repeat(30));
        System.out.println("Sum of Array : "+sum(arr));
        System.out.println("-".repeat(30));
        System.out.println("Max Value : "+getMax(array));
        System.out.println("-".repeat(30));
        System.out.println("Min Value : " + getMin(arr));
        System.out.println("-".repeat(30));
        System.out.println("Find Min Value : "+findMin(arr));
        System.out.println("-".repeat(30));
        System.out.println(findMax(array));
    }

    public static void moveAllNegativeNum(int [] arr ){
        int len = arr.length;
        for(int i =0; i < len; i++){
            for(int j = 0; j < len;  j++){
                if(arr[i] > 0){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static int sum(int [] arr){
        int sum = 0;
        for(int n : arr){
            sum = sum + n;
        }
        return sum;
    }

    public static int getMax(int [] arr){
        int res = arr[0];
        for(int n : arr){
            res = Math.max(res,n);
        }
        return res;
    }

    public static int getMin(int [] arr){
        int min = arr[0];
        for(int n : arr){
            min = Math.min(min,n);
        }
        return min;
    }

    public static int findMin(int [] arr){
        int min = arr[0];
        for(int i = 0; i<arr.length -1; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    public static int findMax(int [] arr){
        int max = arr[0];
        for(int i = 0; i<arr.length -1; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
