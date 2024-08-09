package com.java.intervew.stream;

public class Fab {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 1; i < n ; i++){
            System.out.println(genFab(i) + " ");
        }
    }
    public static int genFab(int n){
        if(n <=1){
            return n;
        }
        return genFab(n -1) + genFab(n - 2);
    }
}
