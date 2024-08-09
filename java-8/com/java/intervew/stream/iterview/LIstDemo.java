package com.java.intervew.stream.iterview;

import java.util.Arrays;
import java.util.List;

public class LIstDemo {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(5,5,2,3,1,4);
        int indesToGet = 0;
        Integer index = l1.stream().skip(indesToGet).findFirst().orElse(null);
        System.out.println("Element at index " + indesToGet + ": " + index);
        System.out.println("-".repeat(40));
        int target = 5;
        boolean flag = false;
        for (int num : l1){
            if(target == num){
                flag = true;
                System.out.println("Element got : " + flag + " , " + target);
                break;
            }else {
                flag = false;
                System.out.println("Element not found : " + flag + " , " + target);
                break;
            }
        }
    }
}
