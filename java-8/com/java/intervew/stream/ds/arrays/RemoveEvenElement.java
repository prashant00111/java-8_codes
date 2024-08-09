package com.java.intervew.stream.ds.arrays;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveEvenElement {
    public static void main(String[] args) {
        int [] arr = {8,9,6,3,4,2,5};
        print(arr);
        System.out.println();
        int [] array = evenElement(arr);
        print(array);

    }

    public static int [] evenElement(int [] arr){
        int len = arr.length;
        int oddCount = 0;
        for(int i = 0; i< len ; i++){
            if(arr[i] % 2 != 0){
                oddCount++;
            }
        }

        int [] resultArray = new int[oddCount];
        int idex = 0;

        for (int i = 0; i < len; i++){
            if(arr[i] % 2 != 0){
                resultArray[idex] = arr[i];
                idex++;
            }
        }

        return Arrays.stream(Arrays.stream(resultArray).toArray()).sorted().toArray();
    }

    public static void print(int [] arr ){
        int len = arr.length;
        for(int i = 0; i< len; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
