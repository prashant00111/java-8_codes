package com.java.intervew.stream.ds.arrays;

public class Array {
    public static void main(String[] args) {
        int [] array = {5,9,3,7,4,5,2};
        print(array);
    }

    public static void print(int [] array){
        int len = array.length;
        for(int i = 0; i < len; i++){
            System.out.print(array[i] + " ");
        }
    }
}
