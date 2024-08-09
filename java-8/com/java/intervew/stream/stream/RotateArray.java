package com.java.intervew.stream.stream;

public class RotateArray {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6,7,8,9};
        int rotation = 4;
        int rotateArray [] = rotateArray(arr,rotation);

        System.out.println("print arr");
        printArray(arr);
        System.out.println("Rotate array");
        printArray(rotateArray);

    }

    public static int[] rotateArray(int [] arr, int steps){
        int n = arr.length;
        int [] rotateArr = new int[n];

        for (int i =0; i<n; i++){
            int newPosition = (i + steps) % n;
            rotateArr [newPosition] = arr[i];
        }
        return rotateArr;
    }

    public static void printArray(int[] arr){
        for(int num : arr){
            System.out.println(num + " ");
        }
        System.out.println();
    }
}
