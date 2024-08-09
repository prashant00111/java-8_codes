package com.java.ds.array;

public class ReverseArray {
    public static void main(String[] args) {

        int arr[] = {2,5,7,8,10,9,4,3};
        printArray(arr);
        System.out.println();
         reverseAnArray(arr,2,arr.length-3);//9,10,8
         System.out.println();
         printArray(arr);


    }
    public static void printArray(int[] arr){
        int len = arr.length;
        for(int i = 0; i < len; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static int [] reverseAnArray(int [] arr, int start, int end){
        while (start <end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
}
