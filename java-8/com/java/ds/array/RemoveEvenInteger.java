package com.java.ds.array;

public class RemoveEvenInteger {
    public static void printArray(int[] arr){
        int len = arr.length;
        for(int i = 0; i<len; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,2,4,7,10,6,5};
        int res[] =  removeEvenNum(arr);
        printArray(res);

    }

    public static int[] removeEvenNum(int[] arr) {
        int oddCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                oddCount++;
            }
        }
        int[] result = new int[oddCount];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                result[index] = arr[i];
                index++;
            }
        }
        return result;
    }
}
