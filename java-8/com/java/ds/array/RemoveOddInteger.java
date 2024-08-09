package com.java.ds.array;

public class RemoveOddInteger {

    public static void printArray(int []arr){
        int len = arr.length;
        for(int i = 0; i < len; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static int[] removeOddNumber(int arr []){
        int len = arr.length;
        int evenCount = 0;
        for(int i = 0; i < len; i++){
            if(arr[i]%2 ==0){
                evenCount++;
            }
        }
        int [] res = new int[evenCount];
        int idx = 0;
        for(int j = 0; j < len; j++){
            if(arr[j]%2 ==0){
                res[idx]  = arr[j];
                idx++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int [] arr = {3,7,9,6,1,4,8,10};
        int array[] = removeOddNumber(arr);
        printArray(array);

    }
}
