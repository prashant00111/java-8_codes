package com.java.intervew.stream.dec;

import java.util.Arrays;

public class ArrayMultiDemo {
    public static void main(String[] args) {
        String [] arr = {"Bangalore","Pune","Hyderabad","Jaunpur","Varanasi"};
        Arrays.stream(arr).flatMap(city -> Arrays.stream(city.split(" ")))
                .filter(w -> !w.isEmpty()).forEach(city ->{int sum = city.chars().sum();
                    System.out.println(city + " : Chars ASCII  : " + sum);
                } );
    }
}
