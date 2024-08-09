package com.java.intervew.stream.jan;

public class NumToString {
    private static final String units [] = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    private static final String teens [] = {"", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private static final String tens [] = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    public static String convertToWords(int num) {
        if (num == 0) {
            return "Zero";
        }
        return convertToWordsHelper(num).trim();
    }
    public static String convertToWordsHelper(int num){
        String result = " ";
        if(num < 10){
            return result = units[num];
        } else if (num < 20) {
            return result = teens[num - 10];
        } else if (num < 100) {
            return result = tens[num / 10] + " " + convertToWordsHelper(num % 10);
        } else if (num < 1000) {
            return result = units[num / 100] + " Hundred " + convertToWordsHelper(num % 100);
        } else if (num < 1000000) {
            return result = convertToWordsHelper(num / 1000) + " Thousand " + convertToWordsHelper(num % 1000);
        }
        return result;
    }
    public static void main(String[] args) {

        int inputNumber = 7892;
        String words = convertToWords(inputNumber);
        System.out.println("Input: " + inputNumber);
        System.out.println("Output: " + words);
    }
}
