package com.java.intervew.stream.ds.arrays;

public class ResizableArray {
    public static void main(String[] args) {

        int []ogArray = {2,5,8,7,4,3};
        System.out.println("before original size of array - " + ogArray.length);
        ogArray = resize(ogArray,10);
        System.out.println("after resize the array - " + ogArray.length);
    }

    public static int[] resize(int [] arr, int capacity){
        int [] temp = new int[capacity];
        for (int i =0; i< arr.length; i++){
            temp[i] = arr[i];
        }

        return temp;
    }

    public static void print(int [] arr){
        int len = arr.length;
        for(int i =0; i < len; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
