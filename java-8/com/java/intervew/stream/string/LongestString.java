package com.java.intervew.stream.string;

import java.util.Scanner;

public class LongestString {

    public static void main(String[] args) {

    }
    public int lengthOfLongestSubstring(String s) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert the string : ");
        s = sc.nextLine();
        int len = s.length();
        char [] arr = s.toCharArray();
        for(int i = 0; i<len; i++){
            for(int j = i+1; j<len; j++){
                if(arr[i] != arr[j]){
                    char ch[] = new char[]{arr[i]};
                }
            }
        }
        return len;
    }
}
