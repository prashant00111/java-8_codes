package com.java.intervew.stream.array;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(palindrom(-121));
    }

    public static boolean palindrom(int num){
        int originalNum = num;
        int reversedNum = 0;

        while (num > 0) {
            int remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num /= 10;
        }

        return originalNum == reversedNum;
    }
}
