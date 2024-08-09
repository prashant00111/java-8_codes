package com.java.intervew.stream.stream;

public class NonRepeatChar {
    public static void main(String[] args) {
        String str = "iijjkkllmmp";

        int [] feq = new int [200];
        int len = str.length();

        for (int i = 0; i<len; i++){
            feq[str.charAt(i)]++;
        }

        for (int j = 0; j < len; j++){
            if (feq[str.charAt(j)]==1){
                System.out.println(str.charAt(j));
                break;
            }
        }

    }
}
