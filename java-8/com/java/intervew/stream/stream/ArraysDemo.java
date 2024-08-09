package com.java.intervew.stream.stream;

public class ArraysDemo {
    public static void main(String[] args) {
        int [] arr = {2, 6, 3, 9, 11,0};
        int num = 4;
        int len = arr.length;
        for(int i = 0; i < len; i++){
            for(int j = i + 1; j< len; j++){
                if(arr[i] + arr[j] ==num){
                    System.out.println(arr[i] + "," +arr[j]);
                }
            }
        }
    }
}
