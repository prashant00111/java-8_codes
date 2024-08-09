package com.java.intervew.stream.ds.arrays;

public class MinValue {
    public static void main(String[] args) {
        int [] arr = {8,5,3,9,6,2,4,-1};
        int min = minimum(arr);
        System.out.println(min);
    }

    public static int minimum(int [] arr){
        int len = arr.length;
        int min = arr[0];
        for (int i = 1; i < len; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
