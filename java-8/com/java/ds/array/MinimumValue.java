package com.java.ds.array;

public class MinimumValue {

    public static void printArray(int [] arr){
        int len = arr.length;
        for(int i = 0; i <len; i++){
            System.out.println(arr[i] + " ");
        }
    }

    public static int findMinimum(int arr []){
        int len = arr.length;
        int min = arr[0];
        for(int i = 1; i<len; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int arr [] = {5,9,10,4,16,2,8,7};
        int minNum = findMinimum(arr);
        System.out.println(minNum);
    }
}
