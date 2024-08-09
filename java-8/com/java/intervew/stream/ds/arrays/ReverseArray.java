package com.java.intervew.stream.ds.arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int [] arr = {8,6,4,5,9,3,1};
        print(arr);
        System.out.println();
        reverse(arr,0,arr.length-1);
        print(arr);
    }

    public static void reverse(int [] arr, int start, int end){
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    private static void print(int [] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
