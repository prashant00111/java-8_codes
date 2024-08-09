package com.java.intervew.stream.iterview;

public class StringTest {
    public static void main(String[] args) {
        String str1 = "Ramy";
        String str2 = "Ram";

        StringBuilder outputBuilder = new StringBuilder();

        int len = str1.length();
        System.out.println(str2.length());
        System.out.println(str2);
        for (int i = 0; i < len; i++){
            char ch = str1.charAt(i);
            if(str2.indexOf(ch) == -1){
                outputBuilder.append(ch);
            }
        }
        String output = outputBuilder.toString();
        System.out.println(output);
    }
}
