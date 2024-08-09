package com.java.intervew.stream.dec;

public class StringDefference {
    public static void main(String[] args) {
        String str = "Ram";
        String s1 = "Ramy";

        int len = s1.length();
        StringBuilder sb = new StringBuilder();

        for(int i =0; i< len; i++){
            char ch = s1.charAt(i);

            if(str.indexOf(ch) ==-1){
                sb.append(ch);
            }
        }

        System.out.println(sb.toString());
    }
}
