package com.java.intervew.stream.ds.arrays;

public class SecondMax {
    public static void main(String[] args) {
        int [] arr = {12,34,2,34,33,1};
        print(arr, arr.length);
        System.out.println();
        int secMaxx = secMax(arr);
        System.out.println("-".repeat(20));
        System.out.println(secMaxx);
    }

    public static int secMax(int [] arr){
        int len = arr.length;
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;

        for(int i = 0; i< len; i++){
            if(arr[i] > max){
                secMax = max;
                max = arr[i];
            } else if (arr[i] > secMax && arr[i] !=max) {
                secMax = arr[i];
            }
        }
        return secMax;
    }

    public static void print(int [] arr, int len){
        for(int i = 0; i<len; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
