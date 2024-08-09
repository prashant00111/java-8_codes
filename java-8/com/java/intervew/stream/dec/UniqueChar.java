package com.java.intervew.stream.dec;

public class UniqueChar {
    public static void main(String[] args) {
        String s = "abbaccddeef";
        int len = s.length();
        int [] arr = new int[200];

        for(int i =0; i < len; i++ ){
            arr[s.charAt(i)]++;
        }

        for(int j = 0; j < len; j++){
            if (arr[s.charAt(j)] ==1) {
                System.out.println(s.charAt(j));
                break;
            }
        }

    }
}
