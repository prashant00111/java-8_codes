package com.java.intervew.stream.iterview;

import java.util.Arrays;

public class RemoveDuplicateElementOldLogic {
    public static void main(String[] args) {

        int[] arr = {5, 9, 8, 7, 3, 2, 4, 1, 6, 5, 7};

        // Using core Java logic to remove duplicates
        int[] resultArray = removeDuplicates(arr);

        // Displaying the result
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Array without Duplicates: " + Arrays.toString(resultArray));
    }

    public static int[] removeDuplicates(int [] arr){
        int len = arr.length;
        for(int i = 0; i < len; i++){
            for(int j = i + 1; j < len; j++){
                if(arr[i] == arr[j]){
                    for(int k = j; k < len -1; k++){
                        arr[k] = arr[ k+ 1];
                    }
                    len--;
                    j--;
                }
            }
        }

        int [] newArray = new int[len];
        System.arraycopy(arr,0,newArray,0,len);
        return newArray;
    }
}
