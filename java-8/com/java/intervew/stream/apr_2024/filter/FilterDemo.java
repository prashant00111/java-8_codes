package com.java.intervew.stream.apr_2024.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterDemo {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
       Stream<Integer> even =  num.stream().filter(n -> n%2 ==0);
       even.forEach(System.out::println);
        System.out.println("-".repeat(50));

        List<String> names = Arrays.asList("Sandip","Ashutosh","Raghav","Ambika","Monika","Manoj");
        Stream<String> name = names.stream().filter(n -> n.length()>5 && n.length()<=6);
        name.forEach(System.out::println);

        System.out.println("-".repeat(50));

        List<String> nameList = names.stream().filter(n -> n.length() >5 && n.length()<=6).collect(Collectors.toList());
        System.out.println(nameList);
        System.out.println("-".repeat(50));
        List<Integer> cubes = num.stream().filter(n -> n % 2 !=0).map(n -> n*n*n).collect(Collectors.toUnmodifiableList());
        System.out.println(cubes);

        System.out.println("-".repeat(50));
        List<String> startWiith = names.stream().filter(n -> n.length()>=5 && n.startsWith("M")).toList();
        startWiith.forEach(System.out::println);

    }
}
