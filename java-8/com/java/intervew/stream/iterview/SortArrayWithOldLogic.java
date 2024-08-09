package com.java.intervew.stream.iterview;

public class SortArrayWithOldLogic {
    public static void main(String[] args) {
        int [] arr = {5,9,7,2,3,4,1};
        int len = arr.length;

        for(int i = 0; i< len; i++){
            for(int j = i +1; j < len; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.print(arr[i] + ", ");
        }
    }
}
