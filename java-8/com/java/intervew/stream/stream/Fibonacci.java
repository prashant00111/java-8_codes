package com.java.intervew.stream.stream;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int n = scan.nextInt();
        System.out.println("Fibonacci Series:");
        for(int i = 0; i < n; i++){
            System.out.println(seriese(i) + " ");
        }
    }

    public static int seriese(int n){
        if(n <=1){
            return n;
        }else {
            return seriese(n - 1) + seriese(n - 2);
        }
    }
}
